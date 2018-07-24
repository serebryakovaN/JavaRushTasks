package com.javarush.task.task21.task2113;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
   private List<Horse> horses;
   public static Hippodrome game;

   public Hippodrome(List horses){
       this.horses=horses;
   }

   public List<Horse> getHorses(){return this.horses;}
    public static void main(String [] args) throws InterruptedException {
       Horse s1=new Horse("hghj",3,0);
       Horse s2=new Horse("jh",3,0);
       Horse s3=new Horse("ttt",3,0);
       List<Horse> t=new ArrayList<Horse>();
               t.add(s1);
               t.add(s2);
               t.add(s3);
       game=new Hippodrome(t);
       game.run();
       game.printWinner();
    }
    public void run() throws InterruptedException {
        for (int i=1;i<=100;i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for (Horse g:horses){
            g.move();
        }

    }
    public void print(){
        for (Horse g:horses){
            g.print();
        }
        for (int i=1; i<=10; i++){
            System.out.println();
        }

    }
    public Horse getWinner(){

        int n=0;
        Horse w=null;
        for (Horse g:horses){
            if ((int)g.getDistance()>n){
                n=(int)g.getDistance();
                w=g;
            }
                   }
        return w;

    }
    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!")  ;
    }

}
