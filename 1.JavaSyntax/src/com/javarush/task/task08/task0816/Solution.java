package com.javarush.task.task08.task0816;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Aaaa", new Date("JUNE 1 1980"));
        map.put("Bbbb", new Date("APRIL 30 1985"));
        map.put("Ccccc", new Date("JUNE 1 1983"));
        map.put("Ddddd", new Date("MARCH 31 1980"));
        map.put("Eeee", new Date("JUNE 1 1980"));
        map.put("Jjjj", new Date("JANUARY 5 1970"));
        map.put("Gggg", new Date("JUNE 1 1980"));
        map.put("Kkkk", new Date("FEBRUARY 1 1980"));
        map.put("Llll", new Date("JULY 13 1980"));


        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator <HashMap.Entry<String, Date>> r =map.entrySet().iterator();

        while (r.hasNext())
        {
            HashMap.Entry<String, Date> m =r.next();
            if (m.getValue().getMonth()>=5 & m.getValue().getMonth()<=7)
            {
                r.remove();

                }
        }

    }

    public static void main(String[] args) {

        HashMap<String, Date> mq=createMap();

       removeAllSummerPeople(mq);
        Iterator <HashMap.Entry<String, Date>> r =mq.entrySet().iterator();
        while (r.hasNext())
        {
            HashMap.Entry<String, Date> m =r.next();
            //System.out.println(m.getKey()+"-" +m.getValue());
        }

    }
}
