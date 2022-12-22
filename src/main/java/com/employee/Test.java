package com.employee;

import java.util.HashMap;
import java.util.Map;

public class Test {


    public static void main(String[] args) {

        Map<Employee , String> map = new HashMap<>();

        Employee e = new Employee(1 , "Amar");
        Employee e1 = new Employee(1 , "Amar");

        map.put(e,"Amar");
        map.put(e1,"Amar");
        map.put(e,"Amar");


        System.out.println(e.equals(e1));
        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());

        System.out.println( "Size of map "+  map.size());

    }
}
