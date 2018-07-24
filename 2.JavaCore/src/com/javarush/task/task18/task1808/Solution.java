package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file1=reader.readLine();
        String file2=reader.readLine();
        String file3=reader.readLine();
        FileInputStream fileInput1=new FileInputStream(file1);
        FileOutputStream fileOutput1=new FileOutputStream(file2);
        FileOutputStream fileOutput2=new FileOutputStream(file3);
        byte[]b=new byte[fileInput1.available()];
        fileInput1.read(b);
        int n=0;
        if (b.length%2==0){
            n=b.length/2;
        }
        else n=b.length/2+1;
        fileOutput1.write(b,0,n);
        fileOutput2.write(b,n,b.length-n);

        fileInput1.close();
        fileOutput1.close();
        fileOutput2.close();
        reader.close();
    }
}
