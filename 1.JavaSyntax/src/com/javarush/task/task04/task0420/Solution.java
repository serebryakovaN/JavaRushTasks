package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        int n1, n2,n3;
        if (a>b){
            n1=a;
            n2=b;
        }
        else {n1=b;
        n2=a;}

        if (n1>c){
n3=c;
        }
        else {
            a=n1;
            n1=c;

            n3=a;}

            if (n2>n3)
            {
                System.out.println(n1+" "+n2+" "+n3);
            }
            else
            {
                System.out.println(n1+" "+n3+" "+n2);
            }
    }

    }

