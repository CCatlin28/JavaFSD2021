package com.christycatlin.day4;

import java.util.ArrayList;
import java.util.Collections;

class Student04 implements Comparable{
    private String studentname;
    private int id;
    private int grade;


    public Student04(String studentname, int id, int grade) {
        this.studentname = studentname;
        this.id = id;
        this.grade = grade;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
//following website instructions .. something is wrong with my coding
    //https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
//    @Override
//    public int compareTo(Student04 id){
//        int compId = ((Student04)id).getId();
//        return this.compID - id;
//
//    }

    @Override
    public String toString(){
        return "Student ID: "+id+", Student Name: " + studentname;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Organize extends Student04{


    public Organize(String studentname, int id, int grade) {
        super(studentname, id, grade);
    }

    public static void main(String[] args) {
        ArrayList<Student04> slist = new ArrayList<>();
        slist.add(new Student04("Rena", 23,10));
        slist.add(new Student04("Aiden", 3, 4));
        slist.add(new Student04("Christy", 28,20));
        slist.add(new Student04("Mike", 6, 16));

        Collections.sort(slist);
        for(Student04 list: slist){
            System.out.println(list);
        }



    }
}
