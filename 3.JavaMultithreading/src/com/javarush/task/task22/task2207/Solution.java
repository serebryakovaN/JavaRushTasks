package com.javarush.task.task22.task2207;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        List<String> list=new ArrayList<>();
        reader.close();
        reader =new BufferedReader(new FileReader(file));
        while(reader.ready()){
            String [] f=reader.readLine().split(" ");

            Collections.addAll(list,f);
        }
        List<StringBuilder> list1=new ArrayList<>();
        for (String m:list){
            list1.add(new StringBuilder(m));
        }


reader.close();


       /* for (StringBuilder t: list1){
            System.out.println(t.toString());
        }*/
      //  System.out.println("--------");
        for (int i=0; i<list1.size()-1;i++){
            for (int j=i+1;j<list1.size();j++){
            if (list1.get(i).toString().equals(list1.get(j).reverse().toString())){
           //     System.out.println(list1.get(i).toString()+"да"+list1.get(j).reverse().toString());

                result.add(new Pair(list1.get(i).toString(),list1.get(j).reverse().toString()));
                list1.remove(j);
                list1.remove(i);
                i--;
                break;
            }
           // else System.out.println("нет");

            }
        }

      //  System.out.println("--------");
        for (Pair t:result){
            System.out.println(t.first+" "+t.second);
        }


    }

    public static class Pair {
        String first;
        String second;


        public Pair(){};
        public Pair(String s1, String s2){
            first=s1;
            second=s2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
