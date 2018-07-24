package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {


        String file1=args[0];
        String file2=args[1];

        FileInputStream fIn=new FileInputStream(file1);
        FileOutputStream fOt=new FileOutputStream(file2);
        Charset u=Charset.forName("UTF-8");
        Charset w= Charset.forName("Windows-1251");
        byte [] b=new byte[2000];
      fIn.read(b);
      String s=new String(b,w);
      b=s.getBytes(u);
      fOt.write(b);

        fIn.close();
        fOt.close();
    }
}
