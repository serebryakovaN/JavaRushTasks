package com.javarush.task.task05.task0519;

/* 
Ходим по кругу
*/


public class Circle {
    //напишите тут ваш код
    int centerX, centerY, radius, width, color;

    public Circle(int cX, int cY, int r){
        centerX=cX;
        centerY=cY;
        radius=r;
    }
    public Circle(int cX, int cY, int r, int w){
        centerX=cX;
        centerY=cY;
        radius=r;
        width=w;
    }
    public Circle(int cX, int cY, int r, int w, int c){
        centerX=cX;
        centerY=cY;
        radius=r;
        width=w;
        color=c;
    }

    public static void main(String[] args) {

    }
}
