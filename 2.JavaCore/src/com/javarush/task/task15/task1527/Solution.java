package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //add your code here


        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s =reader.readLine();
        reader.close();
        int n=s.indexOf("?");
        //System.out.println(n);
        String m =s.substring(n+1);
       //System.out.println(m);
        String []b=m.split("&");
        //System.out.println(b[0]);
        String param="";
        String obj="";
        for (int i=0;i<b.length;i++)
        {
            String h=red(b[i])[0];
            param=param+h+" ";

        }
        System.out.println(param);
        for (int i=0;i<b.length;i++)
        {
            String h=red(b[i])[0];
            if (h.equals("obj"))
            {
                try {
                    double d=Double.parseDouble(red(b[i])[1]);
                    alert(d);
                }
                catch (Exception e){alert(red(b[i])[1]);}
            }
        }




    }
    public static String[] red(String s){
        String[] t;
        return t=s.split("="); }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
