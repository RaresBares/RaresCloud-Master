package de.rares.rarescloud.master.commands;


import de.rares.rarescloud.master.MyLog;
import sun.rmi.runtime.Log;

import java.util.Arrays;
import java.util.List;

public class CLOUD_Stop implements Command{


    public CLOUD_Stop(){
        MyLog.log("Stop-Command initialisiert");
    }
    public void execute(String key) {
        if(getName().contains(key))
        System.exit(1);
    }
    public List<String> getName() {
        List<String> aliases = Arrays.asList("stopmaster", "stopm");

        return aliases;
    }
    public String getHelpMessage() {
        return "| stoppe den Master!";
    }
}
