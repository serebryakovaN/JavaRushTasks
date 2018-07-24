package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set cats = createCats();
        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());

        printCats(cats);
    }

    public static Set createCats() {
        Set cat = new HashSet<>();

        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat c : cats) {
            System.out.println(cats);
        }
    }

    public static class Cat {


    }
}














    /*public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3

        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());

     /*  int n=1;
        Set <Cat> copy=new HashSet<>(cats);
        for (Cat t: copy)
        {
            if(n==1){
                cats.remove(t);
                n++;
            }
        }*/


  /*      printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cat = new HashSet<>();
        cat.add(new Cat("Васька"));
        cat.add(new Cat("Боб"));
        cat.add(new Cat("Мурка"));

        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat c: cats){
            System.out.println(c.name);
        }
    }

    // step 1 - пункт 1

    public static class Cat{
        String name;
        public Cat(String name){
            this.name=name;
        }


    }
}*/
