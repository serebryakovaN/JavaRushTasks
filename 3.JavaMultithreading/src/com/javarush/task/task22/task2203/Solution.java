package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if(string==null){
            throw new TooShortStringException();

        }
        char []h=string.toCharArray();
        int count=0;

        for (int i=0; i<h.length;i++)
        {
            if (h[i]=='\t'){count++;}
        }
        if (count<2)
        {
            throw new TooShortStringException();
        }
        else {
            String []g=string.split("\t");

            return g[1];}
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
