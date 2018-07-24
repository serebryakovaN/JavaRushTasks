package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

import java.util.SplittableRandom;

public class Solution {
    public static void main(String[] args) {

    }
    private Solution(int n){}
    Solution(){}
   protected Solution(String f){}
   public Solution(int n, String f){}
}

