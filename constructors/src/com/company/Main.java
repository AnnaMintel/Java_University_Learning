package com.company;
import java.util.Date;
import Printing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            Book book1 = new Book("Bulgakov", "Ivan", "Master i Margarita");
            String name = book1.getName();
            book1 = new Book("Author", new Date(), "Owner", "name", 0);
            book1 = new Book("Author", new Date(), "Owner", null, 10);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
}
