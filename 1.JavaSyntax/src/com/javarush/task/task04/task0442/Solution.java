package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        boolean s=false;
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        while (!s)
        {
            int n=Integer.parseInt(r.readLine());
            if (n==-1)
            {
                s=true;
                System.out.println(sum-1);
            }
            sum=sum+n;

        }
    }
}
