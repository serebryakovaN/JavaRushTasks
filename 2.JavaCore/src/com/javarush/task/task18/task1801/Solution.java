package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    static int  n=0;
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        FileInputStream file = new FileInputStream(s);


        while (file.available()>0)
        {
            int m=file.read();
            if (m>n){
             n=m;
            }
        }
        System.out.println(n);
        reader.close();
        file.close();
    }


}
