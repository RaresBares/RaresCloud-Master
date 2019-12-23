package de.rares.rarescloud.master.commands;

import java.util.ArrayList;
import java.util.List;

public interface Command {


     void execute(String key);
    List<String> getName();
    String getHelpMessage();


}
