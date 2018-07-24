package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код

   private int top, left, width, height;

   public void initialize (int top, int left, int width, int height){
       this.height=height;
               this.top=top;
               this.left=left;
               this.width=width;
   }

    public void initialize (int top, int left){
      //  this.height=0;
        this.top=top;
        this.left=left;
      //  this.width=0;
    }

    public void initialize (int top, int left, int width){
        this.height=width;
        this.top=top;
        this.left=left;
        this.width=width;
    }


    public void initialize (Rectangle rect){
        this.height=rect.height;
        this.top=rect.top;
        this.left=rect.left;
        this.width=rect.width;
    }
    public static void main(String[] args) {

    }
}
