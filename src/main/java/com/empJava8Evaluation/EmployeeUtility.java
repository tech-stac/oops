package com.empJava8Evaluation;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeUtility {

    public static List<Employee> getSalaryInDesendingOrder(List<Employee> list){
        System.out.println("########## List of employee returnded based on reverse order of salary ##########");
      return  list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
    }
    public static List<Employee> getSalaryInAscendingOrder(List<Employee> list){
        System.out.println(" #############  List of employee returnded based on ASC order of salary ############");
        return list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
    }

    public static List<Employee> getSalaryInAscendingOrderUsingLegacy(List<Employee> list){
        System.out.println(" #############  List of employee returnded based on ASC order of salary ##############");
        return list.stream().sorted(((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))).collect(Collectors.toList());
    }

    public static Map<String, Long> getMaleAndFemaleEmployeCount(List<Employee> list){
        System.out.println("############# List of Male & Female Employee ############");
        return list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    }

    public static List<Employee> getSalaryInDescendongOrderUsingLegacy(List<Employee> list){
        System.out.println(" ############ List of employee returnded based on DESC order of salary ##############");
        return list.stream().sorted(((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))).collect(Collectors.toList());
    }

    public static Map<String, Long> listOfEmployeeInEachDepartment(List<Employee> list){
        System.out.println("############# List of employee In  Department ###############");
        return list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    }

    public static Map<String, List<Employee>> listOfEmployeeInDepartment(List<Employee> list){
        System.out.println("############# List of employee In Department ###############");
        return list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }



    public static void print1by1(List<Employee> list){
        list.forEach(System.out::println);
    }

    public static void print1by1(Map<String, Long> emp){
        System.out.println(emp);
    }

}
