package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
       BigInteger r= BigInteger.valueOf(1);
        if (n>0 && n<=150){
        for (int i=1;i<=n;i++){
            r=r.multiply(BigInteger.valueOf(i));
        }

        }
        else {
            if (n == 0) {
                r = BigInteger.valueOf(1);
            } else r = BigInteger.valueOf(0);
        }
        return ""+r;
    }
}
