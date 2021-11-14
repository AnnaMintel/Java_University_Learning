package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        // write your code here
        Person Person1 = new Person("Anna");
        System.out.printf("Person1 name: %s\n", Person1.getName());
        changeName(Person1);
        System.out.printf("Person1 name: %s\n", Person1.getName());
        changeNameNewObj(Person1);
        System.out.printf("Person1 name: %s\n", Person1.getName());

        Employee employee1 = new Employee("Done");
        Employee employee2 = new Employee("Max", "Yandex");
        employee2.printInfo();

        System.out.println();
        employee2.display();
        employee2.show();

        System.out.println();
        Person person2 = new Employee("Max", "Yandex");
        person2.display();
        person2.show();

        Person person3 = new Person("Dan");
        person3.show();
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








