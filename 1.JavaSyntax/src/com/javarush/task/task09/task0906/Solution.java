package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        String sw=st[2].getClassName();
        String sq=st[2].getMethodName();
        System.out.println(sw+": "+sq+": "+s);

    }
}
