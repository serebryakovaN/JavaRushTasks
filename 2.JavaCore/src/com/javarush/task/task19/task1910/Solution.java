package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
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
            String r=str.replaceAll("[\\p{Punct}\\n]","");
           // String r=str.replaceAll("[\\s,.!]+","").replaceAll(lineSeparator,"");

            writer.write(r);

    }
        reader.close();
        writer.close();
}}
