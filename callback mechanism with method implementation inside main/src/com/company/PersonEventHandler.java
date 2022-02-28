package com.company;

import java.util.Date;

public class PersonEventHandler implements EventHandler{
    public void execute(){
        System.out.printf("Info: %s\n", new Date());
    }
}
