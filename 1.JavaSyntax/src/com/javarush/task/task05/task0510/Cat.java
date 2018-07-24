package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код

    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name){
        this.name=name;
        age=2;
        weight=2;
        color="tuih";
        address=null;
    }
    public void initialize(String name, int weight, int age){
        this.name=name;
        this.weight=weight;
        this.age=age;
        color="tyi";
        address=null;
    }
    public void initialize(String name, int age){
        this.name=name;
        this.weight=2;
        this.age=age;
        color="aaa";
        address=null;

    }

    public void initialize(int weight, String color){

        this.weight=weight;
        this.color=color;
        age=2;
        address=null;
        name=null;

    }
    public void initialize(int weight, String color, String address){

        this.weight=weight;
        this.color=color;
        this.address=address;
        age=2;
        name=null;
    }

    public static void main(String[] args) {

    }
}
