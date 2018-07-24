package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> m = new HashMap<>();
        m.put("Aa", 1000);
        m.put("Bb", 10);
        m.put("CC", 250);
        m.put("Dddd", 540);
        m.put("Cccc", 580);
        m.put("Ffff", 1200);
        m.put("Ssss", 120);
        m.put("Ggggg", 400);
        m.put("Tttt", 300);
        m.put("Ttte", 700);
        return m;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> m = new HashMap<>(map);
        for (Map.Entry<String, Integer> t : m.entrySet()) {
            if (t.getValue() < 500) {
                map.remove(t.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> mq = createMap();

        removeItemFromMap(mq);
        Iterator<HashMap.Entry<String, Integer>> r = mq.entrySet().iterator();
        while (r.hasNext()) {
            HashMap.Entry<String, Integer> m = r.next();
            //System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}