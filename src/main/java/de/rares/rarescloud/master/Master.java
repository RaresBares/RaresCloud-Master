package de.rares.rarescloud.master;

import de.rares.rarescloud.commands.Command;
import de.rares.rarescloud.commands.MASTER_Stop;

import java.util.ArrayList;

public class Master {

    public static ArrayList<Command> commands = new ArrayList<Command>();

    public static void main(String[] args){




    }
    public static void registercommands(){
        commands.add(new MASTER_Stop());
    }


}
