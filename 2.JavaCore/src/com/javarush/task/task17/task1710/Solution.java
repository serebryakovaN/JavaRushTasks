package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
       Date date;
       //formatter.parse(date_time);

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        //date_time = formatter1.format(date);

        if (args[0].equals("-c")){

            if (args[2].equals("м"))
            {
                allPeople.add(Person.createMale(args[1],date=formatter.parse(args[3])));
            }
           else   {
                allPeople.add(Person.createFemale(args[1],date=formatter.parse(args[3])));
            }
            System.out.println(allPeople.size()-1);
        }
        else {
            if (args[0].equals("-u"))
            {
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            if (args[3].equals("м"))
            {
            allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            }
            else {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
            }
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(date=formatter.parse(args[4]));
        }
        else {
                if(args[0].equals("-d"))
                {
                    allPeople.get(Integer.parseInt(args[1])).setName(null);
                    allPeople.get(Integer.parseInt(args[1])).setSex(null);
                    allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
                }
                else System.out.println(allPeople.get(Integer.parseInt(args[1])).toString());
            }
        }


      /*  for (Person p:allPeople)
        {
            System.out.println(p);
        }*/

    }
}
