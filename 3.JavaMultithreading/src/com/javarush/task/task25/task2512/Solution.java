package com.javarush.task.task25.task2512;

/* 
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        if (t != null) {
            t.interrupt();
        }
        Throwable eCause = e.getCause();
        if (eCause != null) {
            uncaughtException(t, eCause);
        }
        System.out.println(e.getClass().getName() + ": " + e.getMessage());
    }
    public static void main(String[] args) {
    }
}
