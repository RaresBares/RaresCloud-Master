package de.rares.rarescloud.master;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyLog {


    public static void log(String msg, Log log) {


        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(new Date()) + " <|" + log.getName() + "|> " + msg);
    }
}


