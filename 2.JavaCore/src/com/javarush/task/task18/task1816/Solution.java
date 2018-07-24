package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
       FileInputStream f=new FileInputStream(args[0]);
        byte[] b = new byte[f.available()];
f.read(b);
int n=0;
for (int i=0;i<b.length;i++)

{
    if ((b[i]<=122&& b[i]>=97) ||(b[i]<=90&& b[i]>=65)){
        n++;
    }
}


        System.out.println(n);
f.close();
    }
}
