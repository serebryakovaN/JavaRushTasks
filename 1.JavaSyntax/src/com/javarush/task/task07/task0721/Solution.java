package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] m=new int[20];

        int maximum;
        int minimum;

        for (int i=0; i<m.length;i++)
        {
            m[i]=Integer.parseInt(reader.readLine());
        }

        maximum=m[0];
        for (int i=0; i<m.length;i++)
        {
            if(m[i]>maximum){
                maximum=m[i];
            }
        }

        minimum=m[0];
        for (int i=0; i<m.length;i++)
        {
            if(m[i]<minimum){
                minimum=m[i];
            }
        }

        //напишите тут ваш код

        System.out.println(maximum+" "+minimum);
        //System.out.println(minimum);
    }
}
