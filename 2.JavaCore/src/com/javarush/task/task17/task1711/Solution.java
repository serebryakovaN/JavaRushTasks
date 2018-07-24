package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        //start here - начни тут

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date;
        //formatter.parse(date_time);

        // SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        //date_time = formatter1.format(date);
        int n = allPeople.size();
        if (args.length != 0) {
            switch (args[0]) {

                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i = i + 3) {
                            if (args[i + 1].equals("м")) {
                                allPeople.add(Person.createMale(args[i], date = formatter.parse(args[i + 2])));
                            } else {
                                allPeople.add(Person.createFemale(args[i], date = formatter.parse(args[i + 2])));
                            }
                        }
                        for (int m = n; m < allPeople.size(); m++)

                        {
                            System.out.println(m);
                        }
                        break;
                    }
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i = i + 4) {
                            allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                            if (args[i + 2].equals("м")) {
                                allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                            } else {
                                allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                            }
                            allPeople.get(Integer.parseInt(args[i])).setBirthDay(date = formatter.parse(args[i + 3]));
                        }
                        break;
                    }
                case "-d":
                    synchronized (allPeople) {

                        for (int i = 1; i < args.length; i = i + 1) {
                            allPeople.get(Integer.parseInt(args[i])).setName(null);
                            allPeople.get(Integer.parseInt(args[i])).setSex(null);
                            allPeople.get(Integer.parseInt(args[i])).setBirthDay(null);
                        }
                        break;
                    }
                default:
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i = i + 1) {
                            System.out.println(allPeople.get(Integer.parseInt(args[i])).toString());
                        }
                    }
            }
        }
    }

      /*  for (Person p:allPeople)
        {
            System.out.println(p);
        }*/

    }

