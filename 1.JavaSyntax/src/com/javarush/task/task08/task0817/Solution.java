package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
HashMap<String,String > m= new HashMap<>();
m.put("Aa","Aaa");
m.put("Bb","Aaa");
m.put("CC","AAkhh");
m.put("Dddd","Hjh");
m.put("Cccc","yuiui");
m.put("Ffff","ttt");
m.put("Ssss","ttt");
m.put("Ggggg","Rrr");
m.put("Tttt","Rrr");
        m.put("Ttte","Rrrr");
        return m;
        }
     public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
         //напишите тут ваш код
         HashMap<String, String> copy = new HashMap<String, String>(map);
         for (Map.Entry<String, String> t: copy.entrySet()) {
             int n = 0;

             for (Map.Entry<String, String> p : copy.entrySet()) {
                 if (t.getValue().equals(p.getValue())) {
                     n++;
                 }
             }
             if(n>1){
                 removeItemFromMapByValue(map,t.getValue());
             }
         }
     }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> mq=createMap();

        removeTheFirstNameDuplicates(mq);
        Iterator<HashMap.Entry<String, String >> r =mq.entrySet().iterator();
        while (r.hasNext())
        {
            HashMap.Entry<String, String> m =r.next();
           // System.out.println(m.getKey()+"-" +m.getValue());
        }
    }
}
