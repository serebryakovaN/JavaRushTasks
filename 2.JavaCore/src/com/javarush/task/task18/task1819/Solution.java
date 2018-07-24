package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String f1=reader.readLine();
        String f2=reader.readLine();
        FileInputStream fIn=new FileInputStream(f1);
        byte []b=new byte [fIn.available()];
        fIn.read(b);
        FileOutputStream fOt1=new FileOutputStream(f1,true);
        FileInputStream fIn2=new FileInputStream(f2);
        byte[]c=new byte[fIn2.available()];
        fIn2.read(c);
        fOt1.write(c);
        fOt1.write(b);
        fIn.close();
        fIn2.close();
        fOt1.close();
        reader.close();
           }
}
