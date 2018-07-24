package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] s = new String[10];
        int [] m=new int[10];
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<s.length;i++)
        {
            s[i]=r.readLine();
            m[i]=s[i].length();
        }
        for (int i=0; i<m.length;i++)
        {
            System.out.println(m[i]);
        }


    }
}
