package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i=1;
        int j=1;
        while (j<=10) {
            while (i <= 9) {
                System.out.print('S');
                i++;
            }
            System.out.println('S');
            i=1;
            j++;
        }
    }
}
