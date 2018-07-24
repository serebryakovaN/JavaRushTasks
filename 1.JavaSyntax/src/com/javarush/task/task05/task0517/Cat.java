package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код

    String name;
    int age;
    String color;
    String address;
    int weight;

    public Cat(String name){
        this.name=name;
        age =2;
        color="aaa";
        weight=3;
     //   address=null;
    }
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        color = "aaa";
        this.weight = weight;
        // address=null;
    }
            public Cat(String name, int age){
            this.name=name;
            this.age=age;
            color="aaa";
            this.weight=2;
            // address=null;


        }
    public Cat(int weight, String color){
        //this.name=name;
        this.age=2;
        this.color=color;
        this.weight=weight;
        //address=null;
        //name=null;
    }
    public Cat(int weight, String color, String address){
        //this.name=name;
        this.age=2;
        this.color=color;
        this.weight=weight;
        this.address=address;
        //name=null;
    }


    public static void main(String[] args) {

    }
}
