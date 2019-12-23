package de.rares.rarescloud.commands;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MASTER_Stop implements Command{
    public void execute() {
        System.exit(0);
    }

    public List<String> getName() {
        List<String> aliases = Arrays.asList("stopm", "stopm");

        return aliases;
    }
}
