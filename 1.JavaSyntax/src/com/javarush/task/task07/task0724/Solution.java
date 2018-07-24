package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human h1=new Human("Вася", true, 60);
        Human h2=new Human("Коля", true, 62);
        Human h3=new Human("Лида", false, 62);
        Human h4=new Human("Катя", false, 58);
        Human h5=new Human("Игорь", true,30,h1,h3);
        Human h6=new Human("Ната", false,28,h2,h4);
        Human h7=new Human("Ира", false,2,h5,h6);
        Human h8=new Human("Оля", false,8,h5,h6);
        Human h9=new Human("Света", false,4,h5,h6);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);
        System.out.println(h9);
    }






    public static class Human {
                //напишите тут ваш код
String name;
boolean sex;
int age;
Human father;
Human mother;

public Human(String name, boolean sex, int age){
    this.name=name;
    this.sex=sex;
    this.age=age;
}

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















