package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static
    {
       threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
       threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static void main(String[] args) {
        //threads.get(0).start();
    }


    public static class Thread1 extends Thread{
        public void run(){
            while (!isInterrupted()){}
        }

    }
    public static class Thread2 extends Thread{
        public void run(){

          {while (isInterrupted()){
              System.out.println("InterruptedException");
          }

            }

        }

    }
    public static class Thread3 extends Thread{
        public void run() {
            while (!interrupted()) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Thread4 extends Thread implements Message{
        public  void showWarning(){

            if(this.isAlive()){
                this.interrupt();
            }
        }

        public void run(){
            showWarning();
        }

    }
    public static class Thread5 extends Thread{

        public void run(){
            /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double sum=0;
            String s;
            try {
                while (!(s=reader.readLine()).equals("N")){
                    sum+=Double.parseDouble(s);
                }

            } catch (Exception e) {
                System.out.println("Ошибка");
            }
            System.out.println(sum);*/

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String current;
            int sum = 0;
            while (true) {
                try {
                    current = reader.readLine();
                    if (!current.equals("N")) sum += Integer.parseInt(current);
                    else break;
                } catch (IOException e) {
                }
            }
            System.out.println(sum);
        }




        }
    }
