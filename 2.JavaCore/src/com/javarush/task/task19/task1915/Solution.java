package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream consoleStream=System.out;
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        PrintStream stream=new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result=outputStream.toString()           ;
      // String [] r=result.split(" ");

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();
        reader.close();
        FileOutputStream writer=new FileOutputStream(fileName);
        writer.write(result.getBytes());
writer.close();
        System.setOut(consoleStream);
        System.out.print(result);



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

