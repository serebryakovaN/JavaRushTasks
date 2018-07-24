package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
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


        int max = 0;

        for (int i = 0; i < m.size(); i++) {
            int nn = 0;
            for (int j = 0; j < b.length; j++) {
                if (b[j] == m.get(i)) {
                    nn++;
                }
            }
            n.add(nn);
            if (nn > max) {
                max = nn;
            }
        }


        for (int i = 0; i < n.size(); i++) {
            if (max == n.get(i)) {
                System.out.print(m.get(i) + " ");
            }
        }
        file.close();
        reader.close();
    }


}

