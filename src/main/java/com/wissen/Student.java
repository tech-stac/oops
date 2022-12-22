package com.wissen;

public class Student {
    public int id;
    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int id)


    { this.name = name; this.id = id;
    }
    public int hashCode() {
        return this.id;
    }
    public String toString()
    { return "Student: " + this.name + "@" + Integer.toHexString(hashCode());
    }
    public boolean equals(Object o) { if (o instanceof Student) { Student s = (Student) o; return s.id == this.id ? true : false; } return false; }
}
