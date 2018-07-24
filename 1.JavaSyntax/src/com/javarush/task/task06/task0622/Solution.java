package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
int []m=new int[5];
for (int i=0; i<5;i++)
{
    m[i]=Integer.parseInt(reader.readLine());
}

for (int i=0;i<m.length-1;i++)
{
    for (int j=i+1;j<m.length;j++)
    {
        if(m[i]>m[j])
        {
            int h=m[i];
            m[i]=m[j];
            m[j]=h;
        }
    }
}
        for (int i=0; i<5;i++)
        {
            System.out.println(m[i]);
        }
    }
}
