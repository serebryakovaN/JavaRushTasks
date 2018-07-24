package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
//FileInputStream m;
    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {

        super(fileName);
        if ((fileName.substring(fileName.length()-4)).equals(".txt")){
          //  m=new FileInputStream(fileName);

        }
        else {
            //m.close();
            super.close();

            throw new UnsupportedFileNameException();
        }

    }

    public static void main(String[] args) {
    }
}

