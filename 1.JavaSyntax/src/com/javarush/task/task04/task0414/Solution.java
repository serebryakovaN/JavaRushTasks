package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n=Integer.parseInt(s);
        String m="количество дней в году: 365";
        if ((n%100==0 & n%400==0) | (n%100!=0 & n%4==0))
        {
           m= "количество дней в году: 366";
        }
        System.out.println(m);
    }
}