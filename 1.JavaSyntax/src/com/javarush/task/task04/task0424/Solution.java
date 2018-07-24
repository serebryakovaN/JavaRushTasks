package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int m [] = new int[3];
for (int i=0; i<3;i++)
{
   m[i]= Integer.parseInt(reader.readLine());
}
int r;
if (m[0]!=m[1] && m[1]==m[2])
{
    r=1;
    System.out.print(r);

}
        if (m[1]!=m[2] && m[0]==m[2])
        {
            r=2;
            System.out.print(r);
        }

        if (m[2]!=m[0] && m[0]==m[1])
        {
            r=3;
            System.out.print(r);
        }
    }
}
