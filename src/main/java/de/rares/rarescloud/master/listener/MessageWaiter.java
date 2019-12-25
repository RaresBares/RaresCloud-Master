package de.rares.rarescloud.master.listener;

import de.rares.rarescloud.master.Log;
import de.rares.rarescloud.master.MyLog;
import de.rares.rarescloud.master.commands.Command;
import de.rares.rarescloud.master.master.Master;

import java.io.IOException;
import java.util.Scanner;

import static de.rares.rarescloud.master.Attributes.wantInit;

public class MessageWaiter extends Thread {

    @Override
    public void run() {

        Scanner sc = new Scanner(System.in);


        while (true) {

            if (sc.hasNextLine()) {

                String cmd = sc.nextLine().toLowerCase();


                if (wantInit) {

                    Command c = null;
                    for (Command c1 : Master.commands) {
                        if (c1.getName().contains("init")) {
                            c = c1;
                        }

                    }
                    if (cmd.equalsIgnoreCase("y") || cmd.equalsIgnoreCase("yes")) {
                        try {

                            c.execute("bypass");


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else if (cmd.equalsIgnoreCase("no") || cmd.equalsIgnoreCase("n")) {
                        wantInit = false;
                        MyLog.log("Du hast den Installation abgebrochen", Log.INFO);
                    } else {
                        MyLog.log("Bitte gebe n/no oder y/yes ein!", Log.ERROR);
                    }


                } else {


                    for (Command c : Master.commands) {
                        try {


                            c.execute(cmd);


                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }


        }


    }


}
