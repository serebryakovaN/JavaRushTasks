package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    //add your code here - добавьте код тут
    static
    {BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName=reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            secondFileName=reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();

        try {
            System.out.println(f.getFileContent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws IOException;

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        BufferedReader reader1;
        String s="";
        @Override
        public void setFileName(String fullFileName) {

            try {
                FileInputStream m=new FileInputStream(fullFileName);
               reader1=new BufferedReader(new InputStreamReader(m));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

        @Override
        public String getFileContent() {
            return s;
        }

public void run(){

    String n;
    try {
        while ((n=reader1.readLine())!=null){
            s=s+" "+n;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    try {
        reader1.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    }
}
