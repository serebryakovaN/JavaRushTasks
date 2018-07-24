package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int[]m=new int[15];
        int ch=0;
        int nch=0;
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<m.length;i++)
        {
            m[i]=Integer.parseInt(r.readLine());
            if(i%2==0)
            {
                ch+=m[i];
            }
            else {nch+=m[i];}
        }
        if(ch>nch){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }


    }
}
