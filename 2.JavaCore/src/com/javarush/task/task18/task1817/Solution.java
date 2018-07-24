package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {

        public static void main(String[] args) throws IOException {
            FileInputStream f=new FileInputStream(args[0]);
            byte[] b = new byte[f.available()];
           f.read(b);
           int n=0;
           for (int i=0;i<b.length;i++)

            {
                if (b[i]==32){
                    n++;
                }
            }


float gf=((float)n/b.length)*100;

            System.out.println(String.format("%(.2f", gf));
          f.close();
        }
    }

