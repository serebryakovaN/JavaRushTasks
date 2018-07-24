package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
  int d=number/100;
  int k=(number-d*100)/10;
  int c=number-d*100-k*10;
  return d+k+c;

        //напишите тут ваш код
    }
}