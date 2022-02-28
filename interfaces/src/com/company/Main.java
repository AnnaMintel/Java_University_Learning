package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        // write your code here

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

        employee2.getInfo();

        Client client1 = new Client("Sara", "Belarusbank");
        client1.getInfo();

        ArrayList<Person> people = new ArrayList<>(); // СПИСКИ
        people.add(new Employee("Tom", "Epam"));
        people.add(new Client("Din", "BPS"));

        System.out.println("\nPeople:\n");
        for(Person p: people){
            p.getInfo();
        }
    }

    static void changeName(Person p) {

        p.setName("Alice");
    }

    static void changeNameNewObj(Person p) {
       // p = new Person(p.getName());
        p.setName("Helen");
        System.out.printf("p name: %s\n", p.getName());
    }
}








