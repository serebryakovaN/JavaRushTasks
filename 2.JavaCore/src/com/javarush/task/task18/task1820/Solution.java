package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String s1=reader.readLine();
        String s2=reader.readLine();
        reader.close();
        reader =new BufferedReader(new FileReader(s1));
        String n=reader.readLine();
        String [] f=n.split(" ");
       int [] d=new int[f.length];
       String now="";
        for (int i=0; i<d.length;i++){
            d[i]=(int)Math.round(Double.parseDouble(f[i]));
            now=now+d[i]+" ";
        }
        //System.out.println(now);
        FileOutputStream fo=new FileOutputStream(s2);
        fo.write(now.getBytes());

        fo.close();
        reader.close();

    }
}
