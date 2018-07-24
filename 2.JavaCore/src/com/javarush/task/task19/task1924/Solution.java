package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static
    {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file1= reader.readLine();
        reader.close();
        reader=new BufferedReader(new FileReader(file1));

        while(reader.ready()){
String str =reader.readLine();
            String m="";
String []strNew=str.split(" ");

   for (int i=0; i<strNew.length;i++) {
       for (Map.Entry<Integer, String> p: map.entrySet())
       {
       if (strNew[i].equals(""+p.getKey())){
           strNew[i]=p.getValue();
       }
    }}
    for (int j=0; j<strNew.length;j++){
       if (j!=strNew.length-1){
           m=m+strNew[j]+" ";}
       else  m=m+strNew[j];}

strNew=null;
            System.out.println(m);

        }
        reader.close();
    }
}
