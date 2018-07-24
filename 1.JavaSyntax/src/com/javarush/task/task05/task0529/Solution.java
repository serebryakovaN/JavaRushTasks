package com.javarush.task.task05.task0529;


import java.io.*;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        boolean b=false;
        while(!b)
        {
            String s=reader.readLine();
          if (!s.equals("сумма")){
              sum+=Integer.parseInt(s);
          }
          else {
              System.out.println(sum);
              b=true;
          }
        }
    }
}
