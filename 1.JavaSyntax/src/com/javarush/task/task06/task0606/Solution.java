package com.javarush.task.task06.task0606;

import java.io.*;
import java.sql.BatchUpdateException;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        String s=r.readLine();
        char [] m=s.toCharArray();
        for (int i=0; i<s.length();i++)
        {
            if (Character.getNumericValue(m[i])%2==0 & Character.getNumericValue(m[i])!=0)
            {
                even++;
        }
        else {if (Character.getNumericValue(m[i])!=0){odd++;}}
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
