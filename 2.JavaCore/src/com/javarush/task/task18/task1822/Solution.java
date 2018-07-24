package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String s1=reader.readLine();
        reader.close();
        reader=new BufferedReader(new FileReader(s1));

        String id=args[0];
        int g=id.length();
        String str=null;
        String id1=id+" ";
        while ((str=reader.readLine())!=null && str.length()>=g){
           // System.out.println(str);
            //System.out.println(str.length());
            String m=str.substring(0,g+1);
            //System.out.println(m.length());
            if (m.equals(id1)){
                System.out.println(str);
            }
        }
        reader.close();
    }
}
