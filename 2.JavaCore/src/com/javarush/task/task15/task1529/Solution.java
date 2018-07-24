package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args)  {

    }
    
    static {
        //add your code here - добавьте код тут
       try {
          reset();
       }
       catch (Exception e){}
    }

    public static Flyable result;

    public static void reset() throws Exception {
        //add your code here - добавьте код тут
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        if (s.equals("helicopter")){
            result=new Helicopter();
        }
        if (s.equals("plane")){
            int n=Integer.parseInt(reader.readLine());
            result=new Plane(n);
        }
        reader.close();

    }
}
