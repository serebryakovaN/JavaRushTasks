package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String > s = new ArrayList<String>();
        s.add("dffs");
        s.add("dggggg");
        s.add("rrrr");
        s.add("pppp");
        s.add("oooo");
        System.out.println(s.size());
        for (int i=0;i<s.size();i++)
        {
            System.out.println(s.get(i));
        }
    }
}
