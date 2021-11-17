package com.company;

public class Magazin implements Printable, Calculatable {
    String name;
    String author;
    static int id = 0;

    Magazin(String name, String author){
        this.name = name;
        this.author = author;
        this.id++;
    }

    public void print(){
        System.out.printf("Magazin \"%s\" by %s\n", name, author);
    }

    public int calculate(){
        return id;
    }


}
