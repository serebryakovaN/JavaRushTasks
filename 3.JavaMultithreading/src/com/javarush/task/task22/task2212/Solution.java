package com.javarush.task.task22.task2212;

import java.util.regex.Pattern;

/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {

        if (telNumber == null) return false;
        String tel = telNumber.replaceAll (" ", "");
        if (!tel.matches ("\\+?[0-9]*\\(?[0-9]{3}\\)?[0-9]+-?[0-9]+-?[0-9]+")) return false;
        if ((tel.contains ("(") || tel.contains (")")) && !tel.matches (".*\\(.*\\).*")) return false;
        int n = tel.replaceAll ("\\D", "").length ( );
        if (n != 10 && !(tel.charAt (0) == '+' && n == 12)) return false;
        return true;



    }

    public static void main(String[] args) {

    }
}
