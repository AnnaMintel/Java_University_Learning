package com.company;

import java.util.Scanner;

public class Money {

        // Переменные
        int first;//номинал купюры
        int second; //количество купюр
        int n; // стоимость единицы товара

        // выводим номинал и количество купюр
        public void showInfo(){
            System.out.printf("Номинал купюр: %s$\n Количество купюр: %d\n", first, second);
        }

        // определяем, хватит ли денежных средств на покупку товара на сумму N рублей
        public void enoughMoney(){
            System.out.printf(((first * second / n) >= 1) ?  "\n Денег достаточно" : "\n Денег не достаточно");
        }

        // определяем, сколько шт товара стоимости n рублей можно купить на имеющиеся денежные средства
        public void countOfGoods(){
            int goods = (first * second / n);
            System.out.printf((goods < 1) ?  "\n Мы не можем купить ни одной единицы товара" :
                    "\n Мы можем купить: %s единиц товара", goods);
        }

        // метод, позволяющий получить-установить значение полей
        public void setValues() {
            try {
                Scanner sc = new Scanner(System.in); // создаем экземпляр класса Scanner
                System.out.println("Введите номинал купюр:");
                first = sc.nextInt();

                System.out.println("Введите количество купюр:");
                second = sc.nextInt();

                System.out.println("Введите стоимость единицы товара:");
                n = sc.nextInt();

            } catch (Exception exception) {
                Mistakes mistakes1 = new Mistakes();
                mistakes1.isError();
            }
        }

        // метод, позволяющий рассчитать сумму денег
        public void countingMoney(){
            System.out.printf("\n Полная сумма равно: ", first * second);
        }
    }


