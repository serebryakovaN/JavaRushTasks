package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String s=args[0];
        BufferedReader reader=new BufferedReader(new FileReader(s));
        Map<String, Double> map=new TreeMap<>();
        Double d=new Double(0);

        while (reader.ready()){
            String q= reader.readLine();
            String q1=q.split(" ")[0];
            Double q2=Double.parseDouble(q.split(" ")[1]);

            if (map.containsKey(q1)){
                if (d<(map.get(q1)+q2)){
                    d=(map.get(q1)+q2);
                }
                map.replace(q1,map.get(q1)+q2);

            }
            else {
                if (d < q2) {
                    d = q2;}
                    map.put(q1, q2);

                }
            }

        reader.close();
   //   System.out.println(d);
       /* for (Map.Entry r: map.entrySet()){
            System.out.println(r.getKey()+" "+r.getValue());
            }
        System.out.println("hjkhkjh");*/

        Map<String, Double> mapMax=new TreeMap<String, Double>();

        for (Map.Entry r: map.entrySet()){
    //System.out.println(r.getKey()+" "+r.getValue());
            if (r.getValue().equals(d))
            {
                //System.out.println("put");
                mapMax.put((String)r.getKey(),(Double)r.getValue());

            }

        }
       // System.out.println("----");

        for (Map.Entry r: mapMax.entrySet()){
            System.out.println(r.getKey());
        }
    }

}
