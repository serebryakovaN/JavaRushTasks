package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        int n1=Integer.parseInt(r.readLine());

        int n2=Integer.parseInt(r.readLine());
        int n3=Integer.parseInt(r.readLine());
        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+n3+"."+n2+"."+n1);


    }
}
