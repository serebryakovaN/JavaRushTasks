package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Woman w1=new Woman("Yff", 12, "hh");
        Woman w2=new Woman("gh", 13, "ghg");
        System.out.println(w1);
        System.out.println(w2);
        Man m1=new Man("e",13,"jfdj");
        Man m2=new Man("jh", 23,"khh");
        System.out.println(m1);
        System.out.println(m2);
    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public String toString(){
            return name+" "+age+" "+address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public String toString(){
            return name+" "+age+" "+address;
        }
    }
}
