package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("арбуз","ягода");
        map.put("банан","трава");
        map.put("вишня","ягода");
        map.put("груша", "фрукт");
        map.put("дыня","овощ");
        map.put("ежевика","куст");
        map.put("жень-шень","корень");
        map.put("земляника","ягода");
        map.put("ирис","цветок");
        map.put("картофель","клубень");

        for (HashMap.Entry<String, String> p: map.entrySet()){
            System.out.println(p.getKey()+" - "+p.getValue());
        }



    }
}