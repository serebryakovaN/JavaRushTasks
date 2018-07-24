package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {

char []h=string.toCharArray();
int count=0;

for (int i=0; i<h.length;i++)
{

    if (h[i]==' '){count++;}
}
        if (count<4)
        {
            throw new TooShortStringException();
        }
        String []g=string.split(" ");
        StringBuilder n=new StringBuilder("");
        for (int i=1;i<5;i++){
            n.append(g[i]+" ");
        }
        return n.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
