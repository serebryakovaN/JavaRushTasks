package com.javarush.task.task18.task1813;

import java.io.*;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    public FileOutputStream file;

    public AmigoOutputStream(FileOutputStream f) throws FileNotFoundException {
        super(fileName);
        this.file=f;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
/*
    public AmigoOutputStream(String name) throws FileNotFoundException {
        super(name);
    }

    public AmigoOutputStream(String name, boolean append) throws FileNotFoundException {
        super(name, append);
    }

    public AmigoOutputStream(File file) throws FileNotFoundException {
        super(file);
    }

    public AmigoOutputStream(File file, boolean append) throws FileNotFoundException {
        super(file, append);
    }

    public AmigoOutputStream(FileDescriptor fdObj) {
        super(fdObj);
    }
*/
    @Override
    public void write(int b) throws IOException {
        file.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        file.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        file.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        file.flush();
        file.write("JavaRush © All rights reserved.".getBytes());
        file.close();
    }

    @Override
    public void flush() throws IOException {
        file.flush();
    }

    @Override
    public FileChannel getChannel() {
        return file.getChannel();
    }

    @Override
    protected void finalize() throws IOException {
        super.finalize();
    }
}
