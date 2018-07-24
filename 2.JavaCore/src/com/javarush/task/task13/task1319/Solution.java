package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String r=reader.readLine();

        BufferedWriter writer=new BufferedWriter(new FileWriter(r));
        while (true) {
            String s = reader.readLine();
            writer.write(s);
            if(s.equals("exit")) break;
            writer.newLine();
        }

        writer.close();
        reader.close();
    }
}