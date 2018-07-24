package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String s=args[0];
        BufferedReader reader=new BufferedReader(new FileReader(s));
        Map<String, Double> map=new TreeMap<>();

        while (reader.ready()){
            String q= reader.readLine();
            String q1=q.split(" ")[0];
            Double q2=Double.parseDouble(q.split(" ")[1]);
            if (map.containsKey(q1)){
                map.replace(q1,map.get(q1)+q2);
            }
            else map.put(q1, q2);

        }
reader.close();

        for (Map.Entry r: map.entrySet()){
            System.out.println(r.getKey()+" "+r.getValue());
        }


    }
}
