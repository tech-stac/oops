package com.split.array.in.chunck.wissen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySplit {

    public static List<int[]> splitArray(int[] array, int splitSize) {
        List<int[]> lst = new ArrayList<>();
        if (splitSize > 0 && splitSize < array.length) {

            for (int i = 0; i < array.length; i = i + splitSize)
                lst.add(Arrays.copyOfRange(array, i, Math.min(array.length, i + splitSize)));
        }else{
            System.out.println("Kindly specify the valid chunck");
        }
        return lst;

    }


    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1};
        int splitSize = 3;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

        List<int[]> list = splitArray(original, splitSize);

        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }


   /* List<Department> departments = List.of(
            new Department(10, "IT"),
            new Department(20, "HR")
    );
    List<Employee> employees = List.of(
            new Employee(3, "David",10),
            new Employee(1, "Peter",10),
            new Employee(5, "Bob",10),
            new Employee(7, "Mark",20),
            new Employee(4, "Frank",20)
    );*/

    //Integer depId = 20; // after execution of 59 line we will ahve 20
    //for (Employee e : employees){
       // if (e.getEmpId == 7){
         //
    //   depId = e.getDepId();
        }
    //}

   // for


    //select d.name from department d inner join employee e on d.depid= e.depid wheere e.id= 7


//need to  deprtment id and count of employee

  //      select departmentId , count(employee) from employees group by departmentId
