package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception  {
        String tag = args[0].toLowerCase();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f = reader.readLine();
        reader.close();
        BufferedReader fIn = new BufferedReader(new FileReader(f));
        String s = "";
        while (fIn.ready()) {
            s += fIn.readLine();
        }
        fIn.close();
        // Заменяем <span> на <span > чтобы не искать по подстроке. Потом вернем обратно
        s = s.replace("<" + tag + ">", "<" + tag + " >");
        // Сколько пар тегов в файле
        int count = 0;
        Pattern p = Pattern.compile("</" + tag + ">");
        Matcher m = p.matcher(s);
        while (m.find())
            count++;
        // Если открывающийся тег, заносим в мапу индекс тега со значением null.
        // Если закрывающийся тег, то ищем последний элемент мапы с null и пищем туда индекс тега
        Map<Integer, Integer> map = new TreeMap<>();
        int pos = -1;
        for (int i=0; i<count*2; i++)
        {
            int posTagBegin = s.indexOf("<" + tag + " ", pos + 1);
            int posTagEnd = s.indexOf("</" + tag + ">", pos + 1);
            if (posTagBegin >=0 && posTagBegin < posTagEnd)
            {
                pos = posTagBegin;
                map.put(posTagBegin, null);
            }
            else
            {
                ArrayList<Integer> keys = new ArrayList<>(map.keySet());
                for (int j=keys.size()-1; j>=0;j--) {
                    if (map.get(keys.get(j)) == null)
                    {
                        map.put(keys.get(j), posTagEnd);
                        break;
                    }
                }
                pos = posTagEnd;
            }
        }
        // Вывод
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(s.substring(entry.getKey(),entry.getValue()+tag.length()+3).replace("<" + tag + " >", "<" + tag + ">"));
        }
    }
}