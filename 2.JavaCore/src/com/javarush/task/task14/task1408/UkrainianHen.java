package com.javarush.task.task14.task1408;

/**
 * Created by hp on 24.09.2017.
 */
public class UkrainianHen extends Hen {


        public int getCountOfEggsPerMonth() {
            return 3;
        }
    public String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.UKRAINE+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";

    }
    }

