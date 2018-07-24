package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int n1=Integer.parseInt(reader.readLine());
int k=0;
if (n1>0)
{
       k++;

    }
        int n2=Integer.parseInt(reader.readLine());
        if (n2>0)
        {
            k++;

        }
        int n3=Integer.parseInt(reader.readLine());
        if (n3>0)
        {
            k++;

        }

        System.out.println(k);
}}
