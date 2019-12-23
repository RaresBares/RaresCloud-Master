package de.rares.rarescloud.master.master;

import de.rares.rarescloud.master.commands.CLOUD_Help;
import de.rares.rarescloud.master.commands.CLOUD_Info;
import de.rares.rarescloud.master.commands.Command;
import de.rares.rarescloud.master.commands.MASTER_Stop;
import de.rares.rarescloud.master.listener.MessageWaiter;

import java.util.ArrayList;

public class Master {

    public static ArrayList<Command> commands = new ArrayList<Command>();

    public static void main(String[] args){

        System.out.println(" _____                      _____ _                 _ \n" +
                "|  __ \\                    / ____| |               | |\n" +
                "| |__) |__ _ _ __ ___  ___| |    | | ___  _   _  __| |\n" +
                "|  _  // _` | '__/ _ \\/ __| |    | |/ _ \\| | | |/ _` |\n" +
                "| | \\ \\ (_| | | |  __/\\__ \\ |____| | (_) | |_| | (_| |\n" +
                "|_|  \\_\\__,_|_|  \\___||___/\\_____|_|\\___/ \\__,_|\\__,_|\n");
        registercommands();
        new MessageWaiter().start();


    }
    public static void registercommands(){
        Runnable r = new Runnable() {
            public void run() {
                registerCommand(new MASTER_Stop());
                registerCommand(new CLOUD_Help());
                registerCommand(new CLOUD_Info());
            }
        };
        Thread t = new Thread(r);
        t.start();



    }
    public static void registerCommand(final Command c){

        Runnable r = new Runnable() {
            public void run() {
                commands.add(c);

            }
        };
        Thread t = new Thread(r);
        t.start();
    }


}
