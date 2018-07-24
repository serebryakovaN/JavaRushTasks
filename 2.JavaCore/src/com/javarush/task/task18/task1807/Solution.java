package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream file = new FileInputStream(s);
        byte[] b = new byte[file.available()];
        file.read(b);

int n=0;
int g=',';
for (int i=0; i<b.length; i++)
{

    if(b[i]==(byte)g)
    {
        n++;
    }
}

        System.out.println(n);
file.close();
reader.close();

    }

}
