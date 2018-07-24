package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap <String, Cat> cr=new HashMap<String, Cat>();
        String s="1";
        cr.put(s,new Cat(s));
        s="2";
        cr.put(s,new Cat(s));
        s="3";
        cr.put(s,new Cat(s));
        s="4";
        cr.put(s,new Cat(s));
        s="5";
        cr.put(s,new Cat(s));
        s="6";
        cr.put(s,new Cat(s));
        s="7";
        cr.put(s,new Cat(s));
        s="8";
        cr.put(s,new Cat(s));
        s="9";
        cr.put(s,new Cat(s));
        s="10";
        cr.put(s,new Cat(s));
        return cr;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> r=new HashSet<>();
        for (Map.Entry<String,Cat> p: map.entrySet()) {
            r.add(p.getValue());
        }
return r;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
