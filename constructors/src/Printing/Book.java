package com.company;

import java.util.Date;

public class Book extends Printing {
    String Author;
    Date PrintDate;
    String Owner; //name vladelec book
    public Book (String Author, Date PrintDate, String  Owner,
                   String name, int pageCount) throws Exception {
        super(name, pageCount);
        this.Author = Author;
        this.PrintDate =PrintDate;
        this.Owner =Owner;

    }

    public Book (String Author, String Owner,
                 String name, int pageCount) throws Exception{
        super(name, pageCount);
        this.Author = Author;
        this Owner = Owner;
        this.PrintDate = new Date();
    }

    public Book (String Author, String Owner,
                 String name) throws Exception{
        this(Author, new Date(), Owner, name, 1);
    }

    public  void set(String A, String P,String  O){
        Author=A;
       // PrintDate=P;
        Owner=O;
    }

    public void showInfo(){

        System.out.printf("Ouner: %s\nAutor: %d\n", Author, Owner);
    }
    public  String getName(){
        return Author;

    }
    public String getOwner(){

        return Owner;
    }
}
