package java8.realtime.usecase.test;

import java8.realtime.usecase.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {


        String s = "abc";
        String s1 = new String ("abc");

        System.out.println(s==s1);



        List<Employee> employees = Arrays.asList(
                new Employee(1276, "FFF",2000.00),
                new Employee(7865, "AAA",1200.00),
                new Employee(4975, "DDD",3000.00),
                new Employee(4499, "CCC",1500.00),
                new Employee(9937, "GGG",2800.00),
                new Employee(5634, "HHH",1100.00),
                new Employee(9276, "BBB",3200.00),
                new Employee(6852, "EEE",3400.00));

        System.out.println("Original List");
        printList(employees);

        // Using sequential stream
        long start = System.currentTimeMillis();
        List<Employee> sortedItems = employees.stream()
                .sorted(Comparator
                        .comparing(Employee::getName))
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();

        System.out.println("sorted using sequential stream");
        printList(sortedItems);
        System.out.println("Total the time taken process :"
                + (end - start) + " milisec.");

        // Using parallel stream
        start = System.currentTimeMillis();
        List<Employee> anotherSortedItems = employees
                .parallelStream().sorted(Comparator
                        .comparing(Employee::getName))
                .collect(Collectors.toList());
        end = System.currentTimeMillis();

        System.out.println("sorted using parallel stream");
        printList(anotherSortedItems);
        System.out.println("Total the time taken process :"
                + (end - start) + " milisec.");


        double totsal=employees.parallelStream()
                .map(Employee::getSalary)
                .reduce(0.00,(a1,a2)->a1+a2);
        System.out.println("Total Salary expense: "+totsal);
        Optional<Employee> maxSal=employees.parallelStream()
                .reduce((Employee  e1, Employee e2) ->
                        e1.getSalary()<e2.getSalary()?e2:e1);
        if(maxSal.isPresent())
            System.out.println(maxSal.get().toString());
    }
    public static void printList(List<Employee> list) {
        for (Employee e : list)
            System.out.println(e.toString());
    }
}
