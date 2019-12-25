package de.rares.rarescloud.master.commands;

import de.rares.rarescloud.master.Log;
import de.rares.rarescloud.master.MyLog;

import java.util.Arrays;
import java.util.List;

public class CLOUD_Info implements Command {
    public CLOUD_Info() {
        MyLog.log("InfoCommand initialisiert", Log.INFO);
    }

    public void execute(String key) {

        if (getName().contains(key)) {

            System.out.println("<--------------------------------->");
            System.out.println("Operating System -> " + System.getProperties().getProperty("os.name"));
            System.out.println("<--------------------------------->");
        }
    }

    public List<String> getName() {
        List<String> list = Arrays.asList("info", "i");
        return list;
    }

    public String getHelpMessage() {
        return "| Schau dir alle Infos an!";
    }
}
