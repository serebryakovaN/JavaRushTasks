package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
  private   Thread thread;
    @Override
    public void run() {

            try {
                while(!Thread.currentThread().interrupted()){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(100);
                }
            }catch (InterruptedException e) {
            }
    }

    @Override
    public void start(String threadName) {
        thread = new Thread (this);
        thread.setName (threadName);
        thread.start ( );
    }

    @Override
    public void stop() {
        thread.interrupt();

    }
}
