package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String s = reader.readLine();
int n= Integer.parseInt(s);
if (n>=1 && n<=999)
{
if (s.length()==1)
{
    if (n%2==0)
    {
        System.out.println("четное однозначное число");
    }
    else {System.out.println("нечетное однозначное число");}
}
else
{
    if (s.length()==2)
    {
        if (n%2==0)
        {
            System.out.println("четное двузначное число");
        }
        else {System.out.println("нечетное двузначное число");}

    }
    else{
    if (n%2==0)
    {
        System.out.println("четное трехзначное число");
    }
    else {System.out.println("нечетное трехзначное число");}}
}

    }
    }

}
