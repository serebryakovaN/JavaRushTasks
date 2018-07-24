package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {

        String s=args[0];
        BufferedReader reader=new BufferedReader(new FileReader(s));

           while (reader.ready()){
            String q= reader.readLine();
               //System.out.println(q);
            String [] q1=q.split(" ");

            int year=Integer.parseInt(q1[q1.length-1]);
              // System.out.println(year);
            int month=Integer.parseInt(q1[q1.length-2]);
               //System.out.println(month);
               int day=Integer.parseInt(q1[q1.length-3]);
            //   System.out.println(day);
               String name="";
            for (int i=0; i<q1.length-3; i++){
              name=name+q1[i]+" ";
            }
name=name.trim();
             //  System.out.println(name);
               Calendar myCalendar = new GregorianCalendar(year, month-1, day);


          PEOPLE.add(new Person(name,myCalendar.getTime()));
        }

        reader.close();

          for (Person p: PEOPLE){
               System.out.println(p.getName()+" "+p.getBirthday());
           }

}
}
