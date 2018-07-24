package com.javarush.task.task08.task0820;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("----");
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код

        HashSet<Dog> dogs =new HashSet<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код

        Set<Object> set =new HashSet<>() ;
        set.addAll(cats);
        set.addAll(dogs);


        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
            for (Cat c: cats){
                Iterator it1=pets.iterator();
                while (it1.hasNext())
                {
                if(it1.next()==c){
                    it1.remove();

                }
            }


            }
    }





    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object o :pets){
            System.out.println(o.toString());
        }

    }

    //напишите тут ваш код
    public static class Cat{}
    public static class Dog{}
}
