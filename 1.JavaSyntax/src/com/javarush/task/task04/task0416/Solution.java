package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String s= reader.readLine();
        float n = Float.parseFloat(s);
        float f = n%5;
        String r="красный";
        if (f<3)
        {
            r="зелёный";
        }
        else
        {
          if (f<4)
          {
              r="желтый";
          }
        }
        System.out.println(r);
    }
}