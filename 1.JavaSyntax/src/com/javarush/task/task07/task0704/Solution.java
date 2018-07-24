package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int[] m=new int[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<m.length;i++)
        {
            m[i]=Integer.parseInt(r.readLine());
        }

        for (int i=m.length-1;i>=0;i--)
        {
            System.out.println(m[i]);
        }
    }
}

