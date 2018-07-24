package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int thisSumCat=this.age+this.weight+this.strength;
        int anotherSumCat=anotherCat.age+anotherCat.strength+anotherCat.weight;
        if (thisSumCat>anotherSumCat)
            return true;
        else  return false;

    }

    public static void main(String[] args) {
Cat cat1=new Cat();
cat1.weight=10;
cat1.age=2;
cat1.strength=4;
Cat cat2=new Cat();
cat2.strength=1;
cat2.age=2;
cat2.strength=2;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
