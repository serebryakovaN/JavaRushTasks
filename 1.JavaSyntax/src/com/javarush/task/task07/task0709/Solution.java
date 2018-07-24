package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> s= new ArrayList<String>();
        BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
        int m;
        for (int i=0; i<5; i++)
        {
            s.add(r.readLine());

        }
m=s.get(0).length();
        for (int i=1; i<5; i++)
        {
             if(s.get(i).length()<m){
                m=s.get(i).length();
            }
        }
        for (int i=0; i<5; i++)
        {

            if(s.get(i).length()==m){
                System.out.println(s.get(i));
            }
        }
    }
}
