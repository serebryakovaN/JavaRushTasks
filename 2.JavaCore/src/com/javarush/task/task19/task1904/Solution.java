package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
       Scanner s=new Scanner(Paths.get("D:/ETZ.txt"));
        PersonScannerAdapter re=new PersonScannerAdapter(s);

        try {
            Person p=re.read();
            System.out.println(p.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;
        public PersonScannerAdapter(Scanner s){
            this.fileScanner=s;
        }

        @Override
        public Person read() throws IOException {
             Person p;
            String m=fileScanner.nextLine();

            String []t=m.split(" ");


            String firstName =t[1];
            String middleName=t[2];
            String lastName=t[0];
            String y=t[5];
            String mm=t[4];
            String dd=t[3];
            SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            Date birthDate= null;
            try {
                birthDate = s.parse(y+"-"+mm+"-"+dd);
            } catch (ParseException e) {
                e.printStackTrace();
            }


            p=new Person(firstName,middleName,lastName,birthDate);

            return p;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
