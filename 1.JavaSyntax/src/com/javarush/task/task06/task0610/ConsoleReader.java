package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader readerS=new BufferedReader(new InputStreamReader(System.in));
        return readerS.readLine();

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader readerS=new BufferedReader(new InputStreamReader(System.in));
        String s=readerS.readLine();
        return Integer.parseInt(s);

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader readerS=new BufferedReader(new InputStreamReader(System.in));
        String s=readerS.readLine();
        return Double.parseDouble(s);

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader readerS=new BufferedReader(new InputStreamReader(System.in));
        String s=readerS.readLine();
        return Boolean.valueOf(s);

    }

    public static void main(String[] args) {

    }
}
