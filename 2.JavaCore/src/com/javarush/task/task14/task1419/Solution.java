package com.javarush.task.task14.task1419;


import java.awt.*;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new DataFormatException());
        exceptions.add(new NullPointerException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new NotBoundException());
        exceptions.add(new FontFormatException("ghfghf"));
        exceptions.add(new ArrayStoreException());
        exceptions.add(new IOException());
        exceptions.add(new InterruptedException());

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
