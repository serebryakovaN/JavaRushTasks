package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream file = new FileInputStream(s);
        byte[] b = new byte[file.available()];

        file.read(b);


        ArrayList<Byte> m = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i < b.length; i++) {
            if (!m.contains(b[i])) {
                m.add(b[i]);
            }
        }



        for (int i = 0; i < m.size()-1; i++) {

            for (int j = i + 1; j < m.size(); j++) {
                if (m.get(j) < m.get(i)) {
                    byte h = m.get(i);
                    m.set((i), m.get(j));
                    m.set(j,h);
                }
            }
        }


        for (int i = 0; i < m.size(); i++) {

                System.out.print(m.get(i) + " ");
            }

        file.close();
        reader.close();




    }
}
