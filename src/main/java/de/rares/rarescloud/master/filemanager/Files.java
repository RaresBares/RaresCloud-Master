package de.rares.rarescloud.master.filemanager;

import java.io.*;
import java.sql.Wrapper;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Files {


    public static String Eula = "#By changing the setting below to TRUE you are indicating your agreement to our EULA (https://account.mojang.com/documents/minecraft_eula).\n" +
            "#Fri May 31 22:37:11 CEST 2019\n" +
            "eula=true\n";

    public static void update() throws IOException {
        File parfile = new File("./");
        for(File f : parfile.listFiles()){
            if(!f.getName().endsWith(".jar")){
                f.delete();
            }
        }
        File config = new File("./config");
        File Saves = new File("./saves");
        File Templates = new File("./templates");
        File Wrapper = new File("./wrapper");
        File properties = new File("./server.properties");
        File eula = new File("./eula.txt");
        config.mkdirs();
        Saves.mkdirs();
        Templates.mkdirs();
        Wrapper.mkdirs();
        properties.createNewFile();


        FileOutputStream fis = new FileOutputStream(eula);
        fis.write(Eula.getBytes());
        fis.flush();
        fis.close();

    }

}
