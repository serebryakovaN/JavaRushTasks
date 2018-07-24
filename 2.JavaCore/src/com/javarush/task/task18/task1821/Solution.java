package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream(args[0]);
        byte[] b = new byte[file.available()];

        file.read(b);

        ArrayList<Byte> m = new ArrayList<>();//символ
        ArrayList<Integer> n = new ArrayList<>();//частота

        for (int i = 0; i < b.length; i++) {
            if (!m.contains(b[i])) {
                m.add(b[i]);
            }
        }

        for (int i = 0; i < m.size(); i++) {
            int nn = 0;
            for (int j = 0; j < b.length; j++) {
                if (b[j] == m.get(i)) {
                    nn++;
                }
            }
            n.add(nn);

        }
//sort
        for (int i = 0; i < m.size()-1; i++) {

            for (int j = i + 1; j < m.size(); j++) {
                if (m.get(j) < m.get(i)) {
                    byte h = m.get(i);
                    int k=n.get(i);
                    m.set((i), m.get(j));
                    m.set(j,h);
                    n.set((i),n.get(j));
                    n.set((j),k);
                }
            }
        }


        for (int i = 0; i < m.size(); i++) {

            System.out.println((char)m.get(i).byteValue() + " "+n.get(i));
        }








        file.close();

    }









    }

