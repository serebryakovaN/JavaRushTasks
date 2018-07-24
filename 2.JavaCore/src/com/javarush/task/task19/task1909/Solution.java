package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName1=reader.readLine();
        String fileName2=reader.readLine();
        reader.close();
        reader=new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer=new BufferedWriter(new FileWriter(fileName2));
        String str=null;
        String lineSeparator = System.getProperty("line.separator");
        while (reader.ready()){
            str=reader.readLine();
            String r=str.replace('.','!')+lineSeparator;
            writer.write(r);
            //writer.append("\n"); //переходим на новую строку
          //  writer.flush();

          //
        }

         reader.close();
        writer.close();

    }
}
