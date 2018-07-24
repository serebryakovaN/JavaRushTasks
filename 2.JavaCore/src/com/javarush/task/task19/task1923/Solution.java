package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String file1=args[0];
        String file2=args[1];
        BufferedReader reader=new BufferedReader(new FileReader(file1));

        BufferedWriter writer=new BufferedWriter(new FileWriter(file2));

        while (reader.ready()){
            String str=reader.readLine();
            String [] s=str.split(" ");
            for (int i=0; i<s.length;i++){
                for (int j=0; j<=9;j++) {
                    if (s[i].contains(""+j)) {
                       writer.write(s[i] + " ");
                       break;
                    }
                }
            }
        }
writer.close();
        reader.close();
    }
}
