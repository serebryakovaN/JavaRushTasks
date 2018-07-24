package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1=null;
        String file2=null;

            file1=reader.readLine();

            file2=reader.readLine();


       BufferedReader reader1=new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
       String s=null;
       while ((s=reader1.readLine())!=null){
           allLines.add(s);
       }

       BufferedReader reader2=new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
        String s1=null;
        while ((s1=reader2.readLine())!=null){
            forRemoveLines.add(s1);
        }

        Solution sw=new Solution();

        sw.joinData();

        reader.close();
    }

    public void joinData () throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);

        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }


    }
}
