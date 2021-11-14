package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person Person1 = new Person("Anna");
        System.out.printf("Person1 name: %s\n", Person1.getName());
        changeName(Person1);
        System.out.printf("Person1 name: %s\n", Person1.getName());
        changeNameNewObj(Person1);
        System.out.printf("Person1 name: %s\n", Person1.getName());
    }

    static void changeName(Person p) {
        p.setName("Alice");
    }

    static void changeNameNewObj(Person p) {
        p = new Person(p.getName());
        p.setName("Helen");
        System.out.printf("p name: %s\n", p.getName());
    }
}
    class Person {
        private String name;

        Person(String name){
            this.name = name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }





