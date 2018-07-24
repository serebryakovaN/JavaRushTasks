package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String f1=reader.readLine();
        String f2=reader.readLine();

        FileInputStream fIn=new FileInputStream(f1);
        FileOutputStream fOt=new FileOutputStream(f2);
        byte [] b=new byte[fIn.available()];
        fIn.read(b);

        byte [] r=new byte[b.length];
        int n=b.length-1;
        for(int i=0;i<b.length;i++)
        {
            r[i]=b[n];
            n--;
        }
        fOt.write(r);
fIn.close();
fOt.close();
reader.close();
    }
}
