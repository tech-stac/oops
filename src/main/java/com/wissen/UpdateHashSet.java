package com.wissen;

import java.util.HashSet;

public  class UpdateHashSet {
    public static void main(String[] args)
    { HashSet<Student> studentList = new HashSet<>();
        Student st1 = new Student("Nimit", 1);
        Student st2 = new Student("Rahul", 3);
        Student st3 = new Student("Nimit", 2);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        System.out.println(studentList.size());
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        st1.id = 3;
        studentList.add(st1);
        System.out.println(st1.hashCode());
        System.out.println(studentList.size());

        for (Student s : studentList)
        System.out.println(s.getId() + " " + s.getName());
    }
}

/*
interface i {

    void syhello(String s);
    String

    String s = "Amar Is On Call With Jeevan";
    String [] s = s.split(" ");
}
s[0].charAt(0).toLowercase()
*/

//






