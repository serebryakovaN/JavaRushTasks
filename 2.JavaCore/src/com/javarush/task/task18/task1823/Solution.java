package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        while ((s=reader.readLine())!=null && !s.equals("exit")){

            ReadThread th = new ReadThread(s);
            th.start();
        }
reader.close();

        System.out.println(resultMap.get("D:/ETZ.txt"));
    }

    public static class ReadThread extends Thread {

        FileInputStream file;
        String filename;
        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            file= new FileInputStream(fileName);
this.filename=fileName;




        }
        // implement file reading here - реализуйте чтение из файла тут

        public void run(){
            byte[] b=null;
            try {
                   b = new byte[file.available()];
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                file.read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }


            ArrayList<Byte> m = new ArrayList<>();
            ArrayList<Integer> n = new ArrayList<>();

            for (int i = 0; i < b.length; i++) {
                if (!m.contains(b[i])) {
                    m.add(b[i]);
                }
            }


            int max = 0;

            for (int i = 0; i < m.size(); i++) {
                int nn = 0;
                for (int j = 0; j < b.length; j++) {
                    if (b[j] == m.get(i)) {
                        nn++;
                    }
                }
                n.add(nn);
                if (nn > max) {
                    max = nn;
                }
            }


            for (int i = 0; i < n.size(); i++) {
                if (max == n.get(i)) {
                    //int h=m.get(i);
                   // String d=""+(char)h;
                    Solution.resultMap.put(this.filename,(int)m.get(i));

                }
            }
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        }
    }

