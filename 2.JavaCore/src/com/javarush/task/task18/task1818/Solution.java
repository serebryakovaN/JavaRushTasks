package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String f1=reader.readLine();
        String f2=reader.readLine();
        String f3=reader.readLine();
        FileInputStream fIn1=new FileInputStream(f2);
        FileOutputStream fOt1=new FileOutputStream (f1,true);
        FileInputStream fIn2=new FileInputStream(f3);
        byte[] b=new byte[fIn1.available()];
        fIn1.read(b);
        fOt1.write(b);
        byte[] b1=new byte[fIn2.available()];
        fIn2.read(b1);
        fOt1.write(b1);
fIn1.close();
fIn2.close();
fOt1.close();
reader.close();
    }
}
