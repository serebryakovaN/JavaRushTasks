package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код

    public Circle (double x, double y, double r){
        this.x=x;
        this.y=y;
        this.radius=r;
    }
    public Circle (double r){

        this.radius=r;
    }

    public Circle (){
        this.x=1.0;
        this.y=2.0;
        this.radius=3.0;
    }
    public Circle (double y, double r){
this.y=y;
        this.radius=r;
    }
    public static void main(String[] args) {

    }
}