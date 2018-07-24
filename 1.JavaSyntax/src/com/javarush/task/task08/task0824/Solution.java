package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1=new Human("Вася",true, 60);
              Human ded2=new Human("Коля", true, 64);
              Human bab1=new Human("Ира", false, 50);
              Human bab2=new Human("Маша", false, 56);
              Human mama=new Human("Лена", false, 30);
              Human papa=new Human("Миша", true, 32);
              Human c1=new Human("Катя", false,10);
              Human c2=new Human("Настя", false, 6);
              Human c3 =new Human("Игорь", true, 2);

              ArrayList<Human> list=new ArrayList<>();
              list.add(c1);
              list.add(c2);
              list.add(c3);
              mama.children.addAll(list);
              papa.children.addAll(list);
        ded1.children.add(mama);
        bab1.children.add(mama);
        ded2.children.add(papa);
        bab2.children.add(papa);

      System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab1.toString());
        System.out.println(bab2.toString());
        System.out.println(mama.toString());
        System.out.println(papa.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=new ArrayList<>();
        }
        public Human(){}

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}

