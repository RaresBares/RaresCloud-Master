package de.rares.rarescloud.master.commands;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CLOUD_Init implements Command{

    @Override
    public void execute(String key) {
        if(getName().contains(key)){



        }
    }

    @Override
    public List<String> getName() {
        List<String> names = Arrays.asList("init", "download");
        return null;
    }

    @Override
    public String getHelpMessage() {
        return "| Initialisiere die Cloud!";
    }
}
