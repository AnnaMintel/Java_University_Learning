package com.company;

public class Person {
    EventHandler handler;

    Person(EventHandler handler) {
        this.handler = handler;
    }

    public void showInformatoin(){
        handler.execute();
    }


}
