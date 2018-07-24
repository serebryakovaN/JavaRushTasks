package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        //напишите тут ваш код

        Cat cat1=new Cat();
        Cat cat2=new Cat();
        System.out.println(cat1);
        System.out.println(cat2);
        Dog d1=new Dog();
        Dog d2=new Dog();
        System.out.println(d1);
        System.out.println(d2);
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    //напишите тут ваш код

    public static class Cat{
        public String toString (){return "Cat";}
    }
    public static class Dog{
        public String toString (){return "Dog";}
    }
}
