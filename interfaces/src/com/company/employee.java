package com.company;

class Employee extends Person{
    private String company;

    public Employee(String name){
        super(name); // вызов конструктора родительского класса
        super.getName(); // вызов метода родительского класса
    }
    public Employee(String name, String company){
        super(name);
        this.company = company;
    }

    public void printInfo(){
        System.out.printf("%s works in %s\n", getName(), company);
    }

    public void display(){
        System.out.printf("employee name is %s\n", getName(), company);
    }

    @Override //  переопределяем метод родительского класса
    public void show(){
        System.out.printf("name: %s\n company: %s\n", getName(), company);
    }

    @Override
    public void getInfo(){
        System.out.println("new get Info");
    }


}