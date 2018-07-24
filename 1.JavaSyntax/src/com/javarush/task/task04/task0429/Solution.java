package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int k = 0;
        int t = 0;
        if (n1 != 0) {
            if (n1 > 0) {
                k++;
            } else t++;
        }

        int n2 = Integer.parseInt(reader.readLine());

        if (n2 != 0) {
            if (n2 > 0) {
                k++;

            } else t++;
        }

        int n3 = Integer.parseInt(reader.readLine());
        if (n3 != 0) {
            if (n3 > 0) {
                k++;

            } else t++;
        }

        System.out.println("количество отрицательных чисел: " + t);
        System.out.println("количество положительных чисел: " + k);
    }

}