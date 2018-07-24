package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        float sum=0;
        int k=0;
        int n=Integer.parseInt(reader.readLine());
        while (n!=-1)
        {

            sum+=n;
            k++;
            n=Integer.parseInt(reader.readLine());
        }
        System.out.print(sum/k);
    }
}

