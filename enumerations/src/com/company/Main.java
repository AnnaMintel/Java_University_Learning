package com.company;

public class Main {


    public static void main(String[] args) {

        Day current = Day.WED;
        System.out. printf("day: %s\n", current); // if we want to display the day of the week
        System.out.printf("day: %s\n", current.ordinal() + 1); // if we want to display the ordinal number from the list

    }
}

