package org.example;

import java.io.Serializable;

public class Student implements Serializable {

    String name;
    int age;


    Student(String piyush, int piyushAge){
        this.age=piyushAge;
        this.name=piyush;
    }

    public static void main(String[] args){
        Student s1 = new Student("amar",23);
        Student s2 = new Student("amqar",323);

        System.out.println(s1);
        System.out.println(s1);
        System.out.println(s2);
    }



}
