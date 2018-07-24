package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(date(3,5,2017));


    }

    public static String date(int d, int m, int y)
    {
        return d+" "+m+" "+y;
    }
}
