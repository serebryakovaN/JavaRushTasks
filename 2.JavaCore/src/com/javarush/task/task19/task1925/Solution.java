package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        String file1=args[0];
        String file2=args[1];
        BufferedReader reader=new BufferedReader(new FileReader(file1));

        BufferedWriter writer=new BufferedWriter(new FileWriter(file2));
List<String> list=new ArrayList<>();
        while (reader.ready()){
            String str=reader.readLine();
            String [] s=str.split(" ");
            for (int i=0; i<s.length;i++){

                    if (s[i].length()>6) {

                      list.add(s[i]);

                    }
                }
            }
            for (int i=0;i<list.size();i++){
            if (i!=list.size()-1){
                writer.write(list.get(i) + ",");
            }
            else  writer.write(list.get(i));
            }

        writer.close();
        reader.close();

    }
}
