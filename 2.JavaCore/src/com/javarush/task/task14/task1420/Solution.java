package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        long n1 = Integer.parseInt(reader.readLine());
        if (n1 <= 0) {
            throw new NumberFormatException();
        }
        long n2 = Integer.parseInt(reader.readLine());
        if (n2 <= 0) {
            throw new NumberFormatException();
        }

        long x = gcd(n1, n2);
        System.out.println(x);
    }







    public static long gcd(long a, long b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }
}
