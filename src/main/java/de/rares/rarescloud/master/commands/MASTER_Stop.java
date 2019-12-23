package de.rares.rarescloud.master.commands;


import java.util.Arrays;
import java.util.List;

public class MASTER_Stop implements Command{
    public void execute(String key) {
        if(getName().contains(key))
        System.exit(1);
    }

    public List<String> getName() {
        List<String> aliases = Arrays.asList("stopmaster", "stopm");

        return aliases;
    }
}
