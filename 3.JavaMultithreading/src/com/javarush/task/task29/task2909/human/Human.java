package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive{
    private static int nextId = 0;
    private int id;
    protected int age;
    protected String name;


    private List<Human> children = new ArrayList<>();

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }



    protected Size size;

  //  protected boolean isSoldier;
public class Size
    {
        public int height;
        public int weight;

    }

    private BloodGroup bloodGroup;

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Human(String name, int age) {
        //this.isSoldier = isSoldier;
        this.name=name;
        this.age=age;
     //   this.id = nextId;
       // nextId++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String getPosition(){
       return "Человек";
   }

    public void live() {
        //   if (isSoldier)
     //   fight();
    }

    public int getId() {
        return id;
    }


    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }

    public void addChild(Human h){
        children.add(h);
    }

    public void removeChild(Human h){
        children.remove(h);
    }
    public void printData(){
        System.out.println(this.getPosition()+": "+name);
    }

}