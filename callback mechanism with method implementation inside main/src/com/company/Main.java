package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Person person1 = new Person(new PersonMethodHandler());
        person1.showInformatoin();

        Person person2 = new Person(new PersonEventHandler());
        person2.showInformatoin();

        Person person3 = new Person(new EventHandler() {
            private boolean on = false;
            @Override
            public void execute() {
                if (on){
                    System.out.println("Пользователь в системе");
                    on = false;
                }
                else {
                    System.out.println("Пользователь вышел из системы");
                    on = true;
                }
            }
        });

        person3.showInformatoin();
        person3.showInformatoin();
        person3.showInformatoin();
    }
}

