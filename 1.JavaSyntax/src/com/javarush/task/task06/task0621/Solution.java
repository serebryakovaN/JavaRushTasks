package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedName=reader.readLine();
        Cat ded=new Cat(dedName);

        String babaName=reader.readLine();
        Cat baba=new Cat(babaName);

        String fatherName=reader.readLine();
        Cat father=new Cat(fatherName, null,ded);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,baba,null);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, father);

        String sunName = reader.readLine();
        Cat catSun = new Cat(sunName, catMother, father);

        System.out.println(ded);
        System.out.println(baba);
        System.out.println(father);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catSun);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }
        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother=mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String nm;
            String nf;
            if (mother == null){nm=", no mother ";}
            else nm=", mother is "+mother.name;
            if (father == null){nf=", no father ";}
            else nf=", father is "+father.name;


                return "Cat name is " + name + nm+ nf;

        }
    }

}
