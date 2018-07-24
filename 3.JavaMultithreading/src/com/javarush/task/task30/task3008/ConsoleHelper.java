package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleHelper {
   private static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

  public static void writeMessage(String message){
       System.out.println(message);

   }
   public static String readString()  {

       try {
          return reader.readLine();
       } catch (IOException e) {
           System.out.println("Некорректный ввод");
           return readString();
       }

   }

   public static int readInt() {
       try {
           return Integer.parseInt(readString());
       }
       catch (NumberFormatException e){
           System.out.println("Некорректный ввод");
           return readInt();
       }

   }



}
