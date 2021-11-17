package com.company;

import java.util.Date;

public class Journal implements Printable{
    String name;
    Date date = new Date();
    int state = 1;

    Journal(String name){
        this.name = name;
    }

    @Override
    public void print(){
        System.out.printf("Journal \"%s\"\n", name);
    }

    @Override
    public  void show(){
        System.out.printf("New Journal Name %s : %s\n", name, date);
    }

    @Override
    public void isClosed(){
        if(state == OPEN)
            System.out.println("Journal is opend");
        else if (state == CLOSED)
            System.out.println("Journal is closed");
        else
            System.out.println("State is invalid");
    }

    public void setState(int n){
        this.state = n;
    }




}
