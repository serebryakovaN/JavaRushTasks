package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String f1=reader.readLine();
        FileReader fr=new FileReader(f1);
        String sN="";
        while (fr.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = fr.read(); //читаем один символ (char будет расширен до int)
            sN+=(char)data;
        }
        String []de=sN.split("[\\s,.!]+");
        String find="world";
        int n=0;
        for (int i=0;i<de.length;i++){
            if(de[i].equals(find)){
                n++;
            }
        }
                       System.out.println(n);
        fr.close();
        reader.close();

    }
}
