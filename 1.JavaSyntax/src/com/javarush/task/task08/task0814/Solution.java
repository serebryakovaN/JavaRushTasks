package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> s= new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(4);
        s.add(6);
        s.add(3);
        s.add(130);
        s.add(22);
        s.add(44);
        s.add(66);
        s.add(120);
        s.add(1330);
        s.add(224);
        s.add(445);
        s.add(16);
        s.add(230);
        s.add(1202);
        s.add(27);
        s.add(47);
        s.add(68);
        s.add(209);
return s;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            Integer s = iter.next();
            if (s>10) {
                iter.remove();
            }
        }
       return set;
    }

    public static void main(String[] args) {

   /*     for (Integer d: removeAllNumbersMoreThan10(createSet())){
            System.out.println(d);
        }*/
    }
}
