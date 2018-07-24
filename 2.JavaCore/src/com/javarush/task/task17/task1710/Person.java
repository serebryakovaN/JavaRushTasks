package com.javarush.task.task17.task1710;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Person {
    private String name;
    private Sex sex;
    private Date birthDay;

    private Person(String name, Sex sex, Date birthDay) {
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
    }
    SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    //date_time = formatter1.format(date);

    public static Person createMale(String name, Date birthDay) {
        return new Person(name, Sex.MALE, birthDay);
    }

    public static Person createFemale(String name, Date birthDay) {
        return new Person(name, Sex.FEMALE, birthDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String toString(){

        return getName()+" "+getSexNew(getSex())+" "+formatter1.format(getBirthDay());
    }
    public String getSexNew(Sex sex){
        if(sex==Sex.FEMALE){
            return "ж";
        }
        else return "м";

    }
}
