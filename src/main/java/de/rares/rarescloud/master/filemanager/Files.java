package de.rares.rarescloud.master.filemanager;

import de.rares.rarescloud.master.Log;
import de.rares.rarescloud.master.MyLog;

import java.io.*;


public class Files {


    public static String Eula = "#By changing the setting below to TRUE you are indicating your agreement to our EULA (https://account.mojang.com/documents/minecraft_eula).\n" +
            "#Fri May 31 22:37:11 CEST 2019\n" +
            "eula=false\n";

    public static void update() throws Exception {


        File config = new File("./config");
        File Saves = new File("./saves");
        File Templates = new File("./templates");
        File Wrapper = new File("./wrapper");
        File properties = new File("./server.properties");
        File eula = new File("./eula.txt");

        removefile(config);
        removefile(Saves);
        removefile(Templates);
        removefile(Wrapper);
        removefile(properties);
        removefile(eula);

        MyLog.log("Bereits existierende Dateien gelöscht", Log.INFO);
        config.mkdirs();
        MyLog.log("Config-Ordner erstellt!", Log.INFO);
        Saves.mkdirs();
        MyLog.log("Saves-Ordner erstellt!", Log.INFO);
        Templates.mkdirs();
        MyLog.log("Templates-Ordner erstellt!", Log.INFO);
        Wrapper.mkdirs();
        MyLog.log("Wrapper-Ordner erstellt!", Log.INFO);
        properties.createNewFile();
        MyLog.log("Properties-Ordner erstellt!", Log.INFO);
        PropFactory pf = new PropFactory(properties);
        pf.SetupServProp();


        FileOutputStream fis = new FileOutputStream(eula);
        fis.write(Eula.getBytes());
        fis.flush();
        fis.close();

    }



    public static void removefile(File f) {
        if (f.isDirectory()) {
            for (File file : f.listFiles()) {
                if (file.isDirectory()) {
                    removefile(file);
                } else {
                    file.delete();

                }
            }
            f.delete();


        }else{
            f.delete();
        }
    }


    public boolean isEulaAccepted(){


        try {

            FileInputStream msg = new FileInputStream(new File("./Eula.txt"));
            BufferedReader br = new BufferedReader(new InputStreamReader(msg));
            String st;
            while ((st = br.readLine()) != null){
                System.out.println(st);
        }


    }catch (Exception e) {
            e.printStackTrace();

    }

        return true;
}

