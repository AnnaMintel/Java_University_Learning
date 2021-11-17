package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Magazin magazin1 = new Magazin("New York Times",
                "Sulzberger");
        magazin1.print();

        Magazin magazin2 = new Magazin("News",
                "BBS");

        System.out.printf("Number of Magazins: %d\n", magazin1.calculate());

        Journal journal1 = new Journal("National Geographic");
        journal1.print();

        Printable printable = new Journal("NatGeo");
        //Printable printable1 = new Rectangle(1, 2, 1, 2);
        printable.print();

        printable = magazin1;
        printable.print();

        if (printable instanceof Magazin) {
            ((Magazin) printable).calculate();
        }
        else {
            ((Journal)printable).print();
        }
        
        
        Printable[] postOffice = {magazin1, journal1, magazin2};
        int magNumber = 0;
        for (Printable file: postOffice) {
            file.print();
            file.show();
            if(file instanceof Magazin)
                magNumber = ((Magazin)file).calculate();

        }
        System.out.printf("Number of magazins: %d\n", magNumber);

        Printable.read();

        //Math.abs(1);
        System.out.println();
        journal1.isClosed();
        journal1.setState(0);
        journal1.isClosed();
        journal1.setState(12);
        journal1.isClosed();

        Printable printable1 = createPrintable("Intexpress", true);

        printInfo(printable1);
        printInfo(createPrintable("Sport", false));
        printInfo(magazin1);
        printInfo(journal1);

        ArrayContainer aContainer = new ArrayContainer();
        System.out.printf("\nlength = %d\n", aContainer.getLength());
        for (int n: aContainer.getAllValues()) {
            System.out.printf("%d\t", n);
        }

        aContainer.add(100);
        System.out.printf("\nlength = %d\n", aContainer.getLength());
        for (int n: aContainer.getAllValues()) {
            System.out.printf("%d\t", n);
        }
    }

    static Printable createPrintable(String name,
                                     boolean isJournal){
        if(isJournal)
            return new Journal(name);
        else
            return new Magazin(name, "Undefined");
    }

    static void printInfo(Printable p){
        p.print();
    }

}
