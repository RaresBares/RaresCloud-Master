package de.rares.rarescloud.master.commands;

import de.rares.rarescloud.master.Log;
import de.rares.rarescloud.master.MyLog;
import de.rares.rarescloud.master.filemanager.Files;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static de.rares.rarescloud.master.Attributes.wantInit;

public class CLOUD_Init implements Command {


    public CLOUD_Init(){
        MyLog.log("Init-Command initialisiert", Log.INFO);
    }

    @Override
    public void execute(String key)  {
        if (getName().contains(key) || key == "bypass") {
            if (wantInit == true) {

                wantInit = false;
                try {
                    Files.update();
                } catch (Exception e) {
                    MyLog.log("Erstellen einer Datei fehlgeschlagen", Log.ERROR);
                }
                MyLog.log("Die Dateien wurden erfolgreich erstellt!", Log.INFO);


            } else {

                wantInit = true;
                MyLog.log("Bei einer neuinstallation gehen alle deine Daten/Dateien verloren.", Log.WARNING);
                MyLog.log("Bist du Sicher dass du die Cloud (neu-)installieren willst?", Log.WARNING);

            }

        }
    }

    @Override
    public List<String> getName() {
        List<String> names = Arrays.asList("init", "download-cloud", "download", "init-cloud");
        return names;
    }

    @Override
    public String getHelpMessage() {
        return "| Initialisiere die Cloud!";
    }
}
