package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] st=Thread.currentThread().getStackTrace();
        return st[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] st=Thread.currentThread().getStackTrace();
        return st[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] st=Thread.currentThread().getStackTrace();
        return st[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] st=Thread.currentThread().getStackTrace();
        return st[2].getLineNumber();

    }

    public static int method5() {

StackTraceElement[] st=Thread.currentThread().getStackTrace();
      //  System.out.println(st[2].getLineNumber());
return st[2].getLineNumber();

    }
}
