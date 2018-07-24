package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        ArrayList<Integer> list0=new ArrayList<Integer>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<20;i++)
        {
            list.add(Integer.parseInt(r.readLine()));
            if (list.get(i)%3==0)
            {
                list3.add(list.get(i));
            }
            if (list.get(i)%2==0)
            {
                list2.add(list.get(i));
            }
            if (list.get(i)%3!=0 & list.get(i)%2!=0)
            {
                list0.add(list.get(i));
            }
        }
        System.out.println("3:");
           printList(list3);
        System.out.println("2:");
        printList(list2);
        System.out.println("0:");
        printList(list0);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer x: list)
        {
            System.out.println(x);
        }
    }
}
