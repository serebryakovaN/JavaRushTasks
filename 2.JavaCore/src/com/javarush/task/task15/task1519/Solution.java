package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=reader.readLine()).equals("exit")){
            if(s.contains(".")){
               try {
                   Double w=Double.parseDouble(s);

                print(w); }
                catch (Exception e){
                    print(s);
                }
            }
            else {
                int n;
                try {
                    n=Integer.parseInt(s);
                    if(n>0 && n<128){
                        print((short)n);
                    }
                    else if (n<=0 || n>=128){print(n);}
                    else print(s);
                }
                catch (Exception e){ print(s);}



            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
