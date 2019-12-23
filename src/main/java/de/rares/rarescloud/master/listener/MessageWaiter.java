package de.rares.rarescloud.master.listener;

import de.rares.rarescloud.master.commands.Command;
import de.rares.rarescloud.master.master.Master;

import javax.annotation.PostConstruct;
import java.util.Scanner;

public class MessageWaiter extends Thread{

    @Override
    public void run(){

        Scanner sc = new Scanner(System.in);


        while (true){

        if(sc.hasNextLine()){
          String cmd =   sc.nextLine().toLowerCase();
          for(Command c : Master.commands){
              c.execute(cmd);
          }
        }



        }


    }

}
