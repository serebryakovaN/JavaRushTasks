package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) throws IOException{

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    {
        readKeyFromConsoleAndInitPlanet();
    }
    public static void readKeyFromConsoleAndInitPlanet()  {
        // implement step #5 here - реализуйте задание №5 тут


        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String s=reader.readLine();

        switch (s){
            case Planet.SUN :thePlanet= Sun.getInstance();break;
            case Planet.MOON: thePlanet=Moon.getInstance();break;
            case Planet.EARTH: thePlanet=Earth.getInstance(); break;
            default:thePlanet=null;

        }}
        catch (IOException e){}

    }
}
