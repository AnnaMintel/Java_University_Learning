/*
 * Минтель Анна, Группа Пв2-20ПО
 */
package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public  class Main {

    public static void main(String[] args) {
        // write your code here

        Money money = new Money();
        money.setValues(); // устанавливаем значение
        money.showInfo(); // показываем инф о купюрах и номинале
        money.countingMoney(); // рассчитываем полную сумму
        money.enoughMoney(); // достаточно ли денег на покупку товара
        money.countOfGoods(); // сколько товара можем купить

        Mistakes mistakes1 = new Mistakes();
        mistakes1.isError();
        }
    }



