package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> s = new ArrayList<>();
        int min;
        int max=0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            s.add(r.readLine());
        }

        min = s.get(0).length();
        for (int i = 0; i < 10; i++) {
            if (s.get(i).length() < min) {
                min = s.get(i).length();
            }
            if (s.get(i).length() > max) {
                max = s.get(i).length();
            }
        }

        for (int i = 0; i < 10; i++) {
            if (s.get(i).length() == min || s.get(i).length() == max) {
                System.out.println(s.get(i));
                i = 10;
            }


        }
    }
}
