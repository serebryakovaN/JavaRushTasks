package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University  {

    private String name;
    private int age;
    private List<Student> students;

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
        this.students=new ArrayList<>();
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:

        for (Student s:students)
        {
            if (s.getAverageGrade()==averageGrade){
                return s;
            }
        }
        return null;

    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
       double  max= students.get(0).getAverageGrade();
       Student s=students.get(0);
        for (int i=1; i<students.size();i++)
        {
            if (students.get(i).getAverageGrade()> max){
                max=students.get(i).getAverageGrade();
                s=students.get(i);
            }
        }
        return s;

    }

    public Student getStudentWithMinAverageGrade(){

        double  min= students.get(0).getAverageGrade();
        Student s=students.get(0);
        for (int i=1; i<students.size();i++)
        {
            if (students.get(i).getAverageGrade()< min){
                min=students.get(i).getAverageGrade();
                s=students.get(i);
            }
        }
        return s;
    }

    public void expel(Student student){
        students.remove(student);
    }
}