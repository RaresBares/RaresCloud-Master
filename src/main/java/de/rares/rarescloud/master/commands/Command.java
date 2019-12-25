package de.rares.rarescloud.master.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface Command {


     void execute(String key) throws IOException;
    List<String> getName();
    String getHelpMessage();


}
