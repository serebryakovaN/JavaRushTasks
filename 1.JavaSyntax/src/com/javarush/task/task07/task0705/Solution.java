package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int [] mm=new int[20];
        int [] m1=new int[10];
        int [] m2=new int[10];
        BufferedReader r= new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<mm.length;i++)
        {
            mm[i]=Integer.parseInt(r.readLine());
        }
        for (int i=0; i<mm.length;i++)
        {
            if(i<10){
            m1[i]=mm[i];
            }
            else {
            m2[i-10]=mm[i];
                System.out.println(m2[i-10]);}
        }
    }
}
