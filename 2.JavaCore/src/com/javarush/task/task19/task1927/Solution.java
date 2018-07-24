package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        String promo = "JavaRush - курсы Java онлайн";
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream bt = new ByteArrayOutputStream();
        PrintStream p = new PrintStream(bt);
        System.setOut(p);
        testString.printSomething();
        String result = bt.toString();
        System.setOut(consoleStream);
       //System.out.println(result);
        BufferedReader reader = new BufferedReader(new StringReader(bt.toString()));

        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            if (++count % 2 == 0) {
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }



    }
    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
         System.out.println("third");
           System.out.println("fourth");
            System.out.println("fifth");
        }




    }

}
