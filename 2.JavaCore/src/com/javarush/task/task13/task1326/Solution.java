package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        InputStream  fstream = new FileInputStream(s);
        ArrayList<Integer> list = new ArrayList();
        try {
          // fstream = new FileInputStream(s);
           BufferedReader reader1 = new BufferedReader(new InputStreamReader(fstream));

           String w1;

           while ((w1 = reader1.readLine()) != null) {
               int n = Integer.parseInt(w1);
               if (n % 2 == 0) {
                   list.add(Integer.parseInt(w1));
               }
           }
       }
        catch (Exception e ) {
            fstream.close();
            //reader1.close();
            reader.close();
        }
            Collections.sort(list);
            for (int t : list) {
                System.out.println(t);
            }
        }


    }





