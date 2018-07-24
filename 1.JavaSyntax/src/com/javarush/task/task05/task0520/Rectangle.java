package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
int top, left, width, height;

public Rectangle(int t, int l)
    {
        top=t;
        left=l;
    }

    public Rectangle(int t, int l, int r)
    {
        top=t;
        left=l;
        width=r;
        height=r;
    }


    public Rectangle(int t, int l, int w, int h)
    {
        top=t;
        left=l;
        width=w;
        height=h;
    }


    public Rectangle(Rectangle r)
    {
        top=r.top;
        left=r.left;
        width=r.width;
        height=r.height;
    }
    public static void main(String[] args) {

    }
}
