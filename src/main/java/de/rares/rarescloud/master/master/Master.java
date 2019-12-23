package de.rares.rarescloud.master.master;

import de.rares.rarescloud.master.commands.Command;
import de.rares.rarescloud.master.commands.MASTER_Stop;
import de.rares.rarescloud.master.listener.MessageWaiter;

import java.util.ArrayList;

public class Master {

    public static ArrayList<Command> commands = new ArrayList<Command>();

    public static void main(String[] args){
        registercommands();
        new MessageWaiter().start();


    }
    public static void registercommands(){
        registerCommand(new MASTER_Stop());
        new MessageWaiter().run();

    }
    public static void registerCommand(Command c){
        commands.add(c);

    }


}
