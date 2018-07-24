package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }
public A(){}
        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }
        private B() throws CloneNotSupportedException {
            super();
            throw new CloneNotSupportedException();
        }

        @Override
        protected B clone() throws CloneNotSupportedException {
            if (this.getClass().getSimpleName().equals("B")){
      B b=new B();}
            return (B)super.clone();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        protected C clone() throws CloneNotSupportedException {
            //B b=new B();
            return (C)super.clone();
        }
    }

    public static void main(String[] args) {

    }
}
