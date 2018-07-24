package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream=System.out;
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        PrintStream stream=new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result=outputStream.toString()           ;
        String [] r=result.split(" ");
        int n=Integer.parseInt(r[0]);
        int n2=Integer.parseInt(r[2]);
        int m=0;
        switch (r[1]){
            case "+": m=n+n2;
            break;
            case "*":m=n*n2;
            break;
            case "-":m=n-n2;
            break;
        }
        System.setOut(consoleStream);
        System.out.print(result);
        System.out.println(m);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

