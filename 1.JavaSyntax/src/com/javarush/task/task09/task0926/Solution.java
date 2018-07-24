package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList <int[]> l=new ArrayList<>();
        int [] x1=new int []{1,2,3,4,5};

        l.add(x1);
        int [] x2=new int []{1,2};
        l.add(x2);
        int [] x3=new int []{1,2,3,4};
        l.add(x3);
        int [] x4=new int []{1,2,3,4,5,6,7};
        l.add(x4);
        int []x5=new int[0];
        l.add(x5);
        return l;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
