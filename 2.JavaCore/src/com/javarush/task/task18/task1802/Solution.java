package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {


    static int  n;
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        FileInputStream file = new FileInputStream(s);

n=file.read();
        while (file.available()>0)
        {
            int m=file.read();
            if (n>m){
                n=m;
            }
           // System.out.println(m);
        }
        System.out.println(n);
        reader.close();
        file.close();

    }
}
