package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //System.out.println(s);
        //напишите тут ваш код
        s.trim();
while (s.contains("  "))
{
    String replace = s.replace("  ", " ");
    s=replace;

}
       //System.out.println(s);
     if (s.length()>0){

        String st="";
        String [] m=s.split("\\b");
        for (int i=0; i<m.length; i++)
        {
            if(i!=m.length-1){
            st=st+m[i].substring(0,1).toUpperCase()+m[i].substring(1,m[i].length()).toLowerCase()+" ";}
            else {st=st+m[i].substring(0,1).toUpperCase()+m[i].substring(1,m[i].length()).toLowerCase();}
        }

        System.out.println(st);
    }

    }
}
