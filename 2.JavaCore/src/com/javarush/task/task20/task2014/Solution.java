package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable{
    public static void main(String[] args) throws IOException {
        String g="D:/ETZ.txt";
        File file=new File(g);
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(file));

        ObjectInputStream in=new ObjectInputStream(new FileInputStream(file));

        Solution savedObject =new Solution(4);
        out.writeObject(savedObject);


        Solution loadedObject=new Solution(5);
        try {
            loadedObject=(Solution)in.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(savedObject.string.equals(loadedObject.string))
        {

        System.out.println("ok");}
    }

  transient   private final String pattern = "dd MMMM yyyy, EEEE";
  transient   private Date currentDate;
  transient   private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
