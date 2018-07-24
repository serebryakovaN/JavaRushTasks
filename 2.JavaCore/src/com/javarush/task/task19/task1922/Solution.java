package com.javarush.task.task19.task1922;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file=reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(file));
        while (reader.ready())
        {int n=0;
        String str=reader.readLine();
        for (int i=0; i<words.size();i++){
            if (str.contains(words.get(i))){
                n++;

            }
        }
        if (n==2){
            System.out.println(str);
        }


        }
        reader.close();
    }
}
