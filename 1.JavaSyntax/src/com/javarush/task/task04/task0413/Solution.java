package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)   );
        String s= reader.readLine();
        int n=Integer.parseInt(s);

            String ss;
            switch (n) {
                case 1: ss="понедельник";
                break;
                case 2: ss="вторник";
                    break;
                case 3: ss="среда";
                    break;
                case 4: ss="четверг";
                    break;
                case 5: ss="пятница";
                    break;
                case 6: ss="суббота";
                    break;
                case 7: ss="воскресенье";
                    break;
                default: ss="такого дня недели не существует";
                    break;
            }
        System.out.println(ss);
    }
}