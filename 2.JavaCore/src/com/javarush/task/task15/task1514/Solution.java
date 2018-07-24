package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
static {
    labels.put(11.0,"GFghfhg");
    labels.put(1.0,"kkjkj");
    labels.put(2.5,"jkjlkjk");
    labels.put(3.0,"jhj");
    labels.put(5.0,"kjjkj");

}


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
