package com.tematihonov;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int firstVar = 10;                          //Примитивный тип данных
        String secondVar = "Вася";                  //Ссылочный  тип данных
        Cat thirdVar = new Cat(secondVar);          //Свой класс тип данных

        //Задание 1.3  - Вывод данных
        System.out.println(firstVar);
        System.out.println(secondVar);
        System.out.println(thirdVar.info());

        //Создание и заполнение массива
        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add(firstVar);
        arr.add(secondVar);
        arr.add(thirdVar);


        //Задание 1.4  - Сравнение всех данных поочереди
        int countOfEqual = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i).equals(arr.get(i+1))){
                countOfEqual++;
            }
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
    }
}
