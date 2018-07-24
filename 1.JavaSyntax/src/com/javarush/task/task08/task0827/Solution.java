package com.javarush.task.task08.task0827;

import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) {

        Date d1 = new Date(date);
    Date d2=new Date(d1.getYear(),0,1);

        long s= (d1.getTime()-d2.getTime())/(24 * 60 * 60 * 1000)+1;


if(s%2==0)
{return false;}

else {return true;}


    }
}
