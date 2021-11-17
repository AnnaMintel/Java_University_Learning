package com.company;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public interface Printable {

    int OPEN = 1;
    int CLOSED = 0;

    void print();

    default void show(){
        System.out.printf("No information\n");
    }

    static void read(){
        System.out.printf("Time: %s\n", new Date());
    }

    default void isClosed(){
        System.out.println("No Info");
    };
/*
    static void readTime(){
        System.out.printf("Time: %s\n", localTime());
    }

    private String localTime(){
        Locale locale = new Locale("by", "BY");
        DateFormat dateFormat =
                DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
        return dateFormat.toString();

    }*/

}
