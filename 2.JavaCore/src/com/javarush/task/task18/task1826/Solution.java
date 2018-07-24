package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream f1=new FileInputStream(args[1]);
        FileOutputStream f2=new FileOutputStream(args[2]);
                switch (args[0]){
                    case "-e":
                        byte[] b=new byte[f1.available()];
                        f1.read(b);
                        for (int i=0; i<b.length;i++){
                            b[i]=(byte)(b[i]+3);
                        }
                        f2.write(b);
                        f1.close();
                        f2.close();
                        break;
                    case "-d":
                        byte[] b1=new byte[f1.available()];
                        f1.read(b1);
                        for (int i=0; i<b1.length;i++){
                            b1[i]=(byte)(b1[i]-3);
                        }
                        f2.write(b1);
                        f1.close();
                        f2.close();
                        break;
                        default:   f1.close();
                            f2.close();
                }
    }

}
