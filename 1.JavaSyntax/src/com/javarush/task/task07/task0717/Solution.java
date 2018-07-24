package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> s= new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10;i++)
        {
            s.add(r.readLine());

        }

        ArrayList<String> result = doubleValues(s);
for (String re: result){
    System.out.println(re);

}
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> s2=new ArrayList<>();

        for (String s: list)
        {
            s2.add(s);
            s2.add(s);
        }

        return s2;
    }
}
