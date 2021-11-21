package Printing;

import java.util.Date;

public class Book extends Printing{
    String Author;
    Date PrintDate;
    String Owner;
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
        this.Owner = Owner;
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
    public  String getAuthor(){
        return Author;

    }
    public String getOwner(){
        return Owner;
    }
    public Date getPrintDate(){
        return PrintDate;}

    public void setOwner(String owner) throws Exception{
        if (owner == null || owner.length() < 1)
            throw new Exception("OwnerName can't be empty or less then one symbol");
        this.Owner = owner.substring(0, 1).toUpperCase() +
                owner.substring(1);
    }
}
