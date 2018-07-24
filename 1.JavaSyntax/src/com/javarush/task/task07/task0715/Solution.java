package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list =new ArrayList();
        String s="именно";
        list.add("мама");
                list.add("мыла");
                list.add("раму");
                list.add(1,s);
                list.add(3, s);
                list.add(5,s);
                for (String k: list){
                    System.out.println(k);

                }

    }
}
