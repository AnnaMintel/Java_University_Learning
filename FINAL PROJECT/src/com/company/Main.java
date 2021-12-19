/*
 * Минтель Анна, Группа Пв2-20ПО
 */
package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import  java.lang.Object;

public  class Main {


    public static void main(String[] args) {
        // write your code here

        Dollars dollars = new Dollars();
        dollars.setValues(); // устанавливаем значение
        dollars.showInfo(); // показываем инф о купюрах и номинале
        dollars.countingMoney(); // рассчитываем полную сумму
        dollars.enoughMoney(); // достаточно ли денег на покупку товара
        dollars.countOfGoods(); // сколько товара можем купить

        Test test = new Test();
        test.equals();
    }

    // делаем ссылку на объект подкласса
    private void Tests() {
        // ссылка на класс Money может ссылаться на класс Dollars
        Money objA = new Money(); // экземпляр (объект) класса Money
        Dollars objB = new Dollars(); // экземпляр (объект) класса Dollars
        Money rA; // ссылка на класс Money

        // ссылке на класс Money присваивается ссылка на экземпляр класса Dollars
        rA = objB;

    }
}



