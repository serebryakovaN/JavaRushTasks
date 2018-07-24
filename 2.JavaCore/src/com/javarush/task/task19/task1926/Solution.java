package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file1= reader.readLine();
        reader.close();
        reader=new BufferedReader(new FileReader(file1));

        while(reader.ready()){
            String str =reader.readLine();
            String s="";
           for (int i=str.length()-1; i>=0;i--) {
               s=s+str.substring(i,i+1);
                                }

            System.out.println(s);

        }
        reader.close();
    }

    }

