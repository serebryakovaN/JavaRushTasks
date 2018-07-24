package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static BufferedReader reader;
    public static void main(String[] args) throws Exception{
        reader=new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        while ((s=reader.readLine())!=null){

            ReadThread   m=new ReadThread(s);
            m.start();

        }


    }
    public static class ReadThread extends Thread{

        FileInputStream file;
        String filename;
        public ReadThread(String fileName) {
            //implement constructor body
            this.filename = fileName;
            try {
                file = new FileInputStream(fileName);

            } catch (FileNotFoundException e) {

                System.out.println(fileName);

                return;

            }


        }
        public void run(){

            try {
                this.file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
