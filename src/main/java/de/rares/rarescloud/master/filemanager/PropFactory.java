package de.rares.rarescloud.master.filemanager;
import java.io.*;
import java.util.Properties;
import java.util.UUID;

public class PropFactory {

    File target;
    public PropFactory(File f){
        target = f;
    }

    public Prop getProp() throws Exception {
        return  new Prop(target);
    }

    public Properties newProp(){

        return new Properties();
    }


    public void SetupServProp() throws Exception {
        String key = UUID.randomUUID().toString().replace("-", "") + "_" + UUID.randomUUID().toString().replace("-", "")+ "_" + UUID.randomUUID().toString().replace("-", "");
        Prop p = getProp();
        p.setProp("port", "27777");
        p.setProp("name", "DeinServer.de");
        p.setProp("wrapper-key", key);
        p.setProp("standart-motd", "A Minecraft Server");
        p.setProp("max-Cloud-Player", "27777");
        p.setProp("enable-broadcast", "true");
        p.setProp("multiwrapper", "true");




    }

}


// port, name, wkey, wartung, standart motd, maxplayers, enable-broadcast, multiwrapper,