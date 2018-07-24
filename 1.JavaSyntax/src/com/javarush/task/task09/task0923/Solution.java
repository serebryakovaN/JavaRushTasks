package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
        String tt=r.readLine();
        char [] x=tt.toCharArray();
String s1="";
String s2="";
for (char t:x)
{
    if (t!=' ') {
        if (isVowel(t)) {
            s1 = s1 + t + " ";

        } else s2 = s2 + t + " ";
    }

}
System.out.println(s1);
System.out.print(s2);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}