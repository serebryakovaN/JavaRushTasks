package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String f1=reader.readLine();
        String f2=reader.readLine();
        FileReader fr=new FileReader(f1);
        FileWriter fw=new FileWriter(f2);
        int n=1;
        while (fr.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = fr.read(); //читаем один символ (char будет расширен до int)
            if(n%2==0){
            fw.write(data);}
            n++;//пишем один символ (int будет обрезан/сужен до char)
        }

        //закрываем потоки после использования
        reader.close();
        fr.close();
        fw.close();
    }
}
