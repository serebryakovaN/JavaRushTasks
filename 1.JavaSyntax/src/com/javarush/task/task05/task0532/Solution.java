package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //напишите тут ваш код

        int n =Integer.parseInt(reader.readLine());
        int []m=new int [n];

        for (int i=0; i<n;i++){
            m[i]=Integer.parseInt(reader.readLine());
        }
        int maximum = m[0];
        for (int i=1; i<n;i++){
           maximum=(m[i] > maximum ? m[i] : maximum);
        }


        System.out.println(maximum);
    }
}
