package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код

        Map<String, String> m= new HashMap<>();
        m.put("Aa","Aaa");
        m.put("Bb","Aaa");
        m.put("CC","AAkhh");
        m.put("Dddd","Hjh");
        m.put("Cccc","yuiui");
        m.put("Ffff","ttt");
        m.put("Ssss","ttt");
        m.put("Ggggg","Rrr");
        m.put("Tttt","Rrr");
        m.put("Aa","Rrrr");

        return m;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
