package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(File f) throws IOException {
        this.fileWriter=new FileWriter(f);
    }
    public FileConsoleWriter(String s) throws IOException {
        this.fileWriter=new FileWriter(s);
    }
    public FileConsoleWriter(File f, boolean append) throws IOException {
        this.fileWriter=new FileWriter(f, append);
    }
    public FileConsoleWriter(String s, boolean append) throws IOException {
        this.fileWriter=new FileWriter(s, append);
    }
    public FileConsoleWriter(FileDescriptor s) throws IOException {
        this.fileWriter=new FileWriter(s);
    }

    public void write(char[] cbuf, int off, int len) throws IOException{

        fileWriter.write(cbuf, off, len);
        System.out.print(String.valueOf(cbuf).substring(off,off+len));

    }

    public void write(int c) throws IOException{
        fileWriter.write(c);
        System.out.print(c);
    }

    public void write(String str) throws IOException{
        fileWriter.write(str);
        System.out.print(str);
    }
    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str,off,len);
        System.out.printf(str.substring(off,off+len));
    }
    public void write(char[] cbuf) throws IOException{
        fileWriter.write(cbuf);
        System.out.printf(String.valueOf(cbuf));
    }
    public void close() throws IOException{
        fileWriter.close();
    }






    public static void main(String[] args) {

    }

}
