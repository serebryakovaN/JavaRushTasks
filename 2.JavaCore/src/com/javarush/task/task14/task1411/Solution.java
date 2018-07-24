package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key ;

        //тут цикл по чтению ключей, пункт 1
        boolean r=true;
        while((key=reader.readLine())!=null && r==true)
        {
            //создаем объект, пункт 2

switch (key){
    case "user": person=new Person.User(); doWork(person);  break;
    case "loser": person= new Person.Loser(); doWork(person);break;
    case "coder": person=new Person.Coder();doWork(person); break;
    case "proger": person= new Person.Proger(); doWork(person);break;
    default: r=false; return;
}

           //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User)
        {
            ((Person.User) person).live();
        }
        if (person instanceof Person.Proger)
        {
            ((Person.Proger) person).enjoy();
        }
        if (person instanceof Person.Coder)
        {
            ((Person.Coder) person).coding();
        }
        if (person instanceof Person.Loser)
        {
            ((Person.Loser) person).doNothing();
        }
    }
}
