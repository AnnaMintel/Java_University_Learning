package com.company;

abstract class Person {
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

    public void display(){
        System.out.printf("person name is %s\n", name);
    }

    public void show(){
        System.out.printf("name: %s\n", name);
    }

    public abstract void getInfo();
}