package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String f1=reader.readLine();
        String f2=reader.readLine();
        reader.close();
        reader=new BufferedReader(new FileReader(f1));

        BufferedWriter writer=new BufferedWriter(new FileWriter(f2));

        while ((reader.ready())){
            int c=reader.read();
            if(c<='9'&& c>='0'){
                writer.write(c);
                writer.write(" ");
            }
        }
    //    System.out.println((int)'0');
      //  System.out.println((int)'9');

        reader.close();
        writer.close();
       // reader.close();

    }
}
