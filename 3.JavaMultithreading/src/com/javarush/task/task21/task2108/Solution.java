package com.javarush.task.task21.task2108;

import javax.transaction.TransactionRequiredException;

/*
Клонирование растений
*/
public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }

    public static class Plant{
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable{
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        @Override
        protected Tree clone() throws CloneNotSupportedException {
            Tree t=(Tree)super.clone();
String [] n=new String [t.getBranches().length];
            System.arraycopy(t.getBranches(),0,n,0,n.length);
            Tree r=new Tree(t.getName(),n);
            return r;
        }

        public String[] getBranches() {
            return branches;
        }
    }
}
