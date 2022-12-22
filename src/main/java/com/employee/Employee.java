package com.employee;

public class Employee {


    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

/*
  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(getId(), employee.getId()) && Objects.equals(getName(), employee.getName());
    }
    //when you comment equals and execute it without override equals then we will get false
    //when you uncomment equals and execute it override equals  then we will get true
*/

  /* @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    *//*

    Case 1
    when you comment hashcode and execute it without hashcode the we will get
     different hashcode for the employee which same data
    e = 918221580
    e1 = 2055281021
     when you comment hashcode and execute it with hashcode we will get
    different hashcode for the employee which same data

    2045277
    2045277
    */
}
