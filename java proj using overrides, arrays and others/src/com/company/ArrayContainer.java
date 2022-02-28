package com.company;

public class ArrayContainer implements Container {

    int[] numbers;

    ArrayContainer(){
        numbers = new int[4];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i*i;
        }
    }

    @Override
    public  void add(int a){
        int[] temp = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++){
            temp[i] = numbers[i];
        }
        temp[numbers.length] = a;
        numbers = temp;
    }

    @Override
    public int getLength(){
        return  numbers.length;
    }

    @Override
    public int[] getAllValues(){
        return numbers.clone();
    }

}
