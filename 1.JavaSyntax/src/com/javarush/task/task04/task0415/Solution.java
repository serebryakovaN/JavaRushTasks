package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a=Integer.parseInt(s1);
        String s2 = reader.readLine();
        int b=Integer.parseInt(s2);
        String s3 = reader.readLine();
        int c=Integer.parseInt(s3);

        if ((a+b)>c & (b+c)>a & (a+c)>b)
        {
            System.out.println("Треугольник существует.");
        }
        else  System.out.println("Треугольник не существует.");
    }
}