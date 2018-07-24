package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int n;
        int m;
        n=Integer.parseInt(reader.readLine());
        m=Integer.parseInt(reader.readLine());

        ArrayList<String> w= new ArrayList<>();
        for (int i=0; i<n;i++)
        {
            w.add(reader.readLine());

        }
        for (int i =0; i<m; i++)
        {
          w.add(w.get(i));

        }
        for (int i =0; i<3; i++)
        {
            w.remove(0);

        }
        for (int i =0; i<w.size(); i++)
        {
            System.out.println(w.get(i));

        }
    }
}
