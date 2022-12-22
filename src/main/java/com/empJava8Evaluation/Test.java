package com.empJava8Evaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {


    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        System.out.println("Sorting using Stream :::: ###############");

        List<Employee> list = EmployeeUtility.getSalaryInDesendingOrder(employeeList);
        EmployeeUtility.print1by1(list);
        List<Employee> list1 = EmployeeUtility.getSalaryInAscendingOrder(employeeList);
        EmployeeUtility.print1by1(list1);
        List<Employee> lists = EmployeeUtility.getSalaryInAscendingOrderUsingLegacy(employeeList);
        EmployeeUtility.print1by1(lists);
        List<Employee> listDESC = EmployeeUtility.getSalaryInDescendongOrderUsingLegacy(employeeList);
        EmployeeUtility.print1by1(listDESC);

        Map<String, Long> map = EmployeeUtility.listOfEmployeeInEachDepartment(employeeList);
        EmployeeUtility.print1by1((map));
        Map<String, Long> emp = EmployeeUtility.getMaleAndFemaleEmployeCount(employeeList);
        EmployeeUtility.print1by1((emp));


        HashMap<String , String> maps = new HashMap<>();

        String a = new String("Hello");
        String b = new String("Hello");
        String c = new String("Hello");
        maps.put(a, "World");
        maps.get(b);
        System.out.println("############# Map Evaluation ###############");
        System.out.println(maps.get(b));
        System.out.println(b.hashCode());
        System.out.println(maps.get(c));
        System.out.println(c.hashCode());
        System.out.println(maps.get(a));
        System.out.println(a.hashCode());





    }

}
