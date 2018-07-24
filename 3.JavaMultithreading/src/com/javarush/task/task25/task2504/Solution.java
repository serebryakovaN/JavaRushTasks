package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/
public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        if (threads!=null){

            for (Thread th: threads){
                switch (th.getState()){
                    case NEW :{ th.start(); break;}

                    case RUNNABLE:
                    {if(th.isInterrupted()){}
                        break;}
                    case BLOCKED:
                    {th.interrupt();
                        break;}
                    case WAITING:
                    {th.interrupt();
                        break;}
                    case TIMED_WAITING:
                    {th.interrupt();
                        break;}
                    case TERMINATED: {
                        System.out.println(th.getPriority());
                        break;}
                }
        }
    }}

    public static void main(String[] args) {
    }
}
