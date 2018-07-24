package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> s = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> d = new ArrayList<>();
        //ArrayList<Integer> ds = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            s.add(r.readLine());
            d.add(s.get(i).length());
            //    ds.add(d.get(i));
        }
        // Collections.sort(ds);

        for (int i = 0; i < 10-1; i++) {
            if (d.get(i) > d.get(i + 1)) {
                System.out.println(i + 1);

            }
        }
    }

   /* public static void main(String[] args) throws IOException {
        BufferedReader g = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            a.add(g.readLine());
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i + 1).length() < a.get(i).length())
                System.out.println(i + 1);//напишите тут ваш код

        }

    }*/
}