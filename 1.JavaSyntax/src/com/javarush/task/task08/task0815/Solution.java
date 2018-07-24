package com.javarush.task.task08.task0815;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String ,String > map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
Iterator<Map.Entry<String,String >> r=map.entrySet().iterator();
int n=0;
while (r.hasNext())
{
    Map.Entry<String,String> w=r.next();
    String s=w.getValue();
    if(s.equals(name)){n++;}
}

        return n;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,String >> r=map.entrySet().iterator();
        int n=0;
        while (r.hasNext())
        {
            Map.Entry<String,String> w=r.next();
            String s=w.getKey();
            if(s.equals(lastName)){n++;}
        }

        return n;
    }


    public static void main(String[] args) {

      getCountTheSameLastName(createMap(), "Dog");
        getCountTheSameFirstName(createMap(), "Dog");
    }
}
