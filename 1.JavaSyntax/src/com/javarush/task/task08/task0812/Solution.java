package com.javarush.task.task08.task0812;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> arr = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {

        String s = reader.readLine();
        arr.add(Integer.parseInt(s));}
int t=1;
        int max=1;

        for (int i=0; i<arr.size()-1;i++)
        {

            if (arr.get(i+1)==arr.get(i)){
                t++;
                if(max<t){max=t;}

            }
            else {t=1;}
        }
        /*


        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0; i<arr.size();i++)
        {
            if(!hm.containsKey(arr.get(i)))
            {
                int m=0;
                for (int j=0; j<arr.size();j++)
                {
                    if(arr.get(j)==arr.get(i))
                    {
                        m++;
                    }
                }
                hm.put(arr.get(i),m);
        }
        }
        int n=0;
        for (HashMap.Entry<Integer, Integer> p: hm.entrySet()){

            if (p.getValue()>n)
            {
                n=p.getValue();
            }
        }*/
        System.out.println(max);
    }

    }
