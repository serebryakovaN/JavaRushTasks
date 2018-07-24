package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static String printMatrix( int n, String value) {

        printMatrix(n, (Object) value);
        return "Заполняем объектами String";
    }
    public static void printMatrix( int n, Object value) {
        System.out.println("Заполняем объектами String");
        printMatrix(n, (Object) value);
    }
    public static String printMatrix( int n, String value, String m) {

        printMatrix(n, (Object) value);
        return "Заполняем объектами String";
    }

    public static String printMatrix( int n, String value, String m, int r) {

        printMatrix(n, (Object) value);
        return "Заполняем объектами String";
    }
    public static long printMatrix( int n, int r) {


        return printMatrix((long)n, (long)r);
    }
    public static long printMatrix( long n, long r) {


        return printMatrix(n, r);
    }
    public static long printMatrix( long n, long r, String u) {


        return printMatrix(n, r);
    }
    public static long printMatrix( long n, long r, Object t) {


        return printMatrix(n, r);
    }
}
