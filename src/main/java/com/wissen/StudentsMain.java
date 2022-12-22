package com.wissen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentsMain {

    public static void main(String[] args) {

        Students s = new Students(1,"Bob","2020-01-05");
        Students s1 = new Students(2,"Alice","2020-01-31");
        Students s2 = new Students(3,"Amar","2020-01-23");
        Students s3 = new Students(null,null,null);
        Students s4 = new Students(null,null,null);

        List<Students> l  = new ArrayList<Students>();
        //ArrayList is better for storing and accessing data.
         /*
         ArrayLists use contiguous memory.
          All elements in the ArrayList are located next to each other in the same memory space.
         This is why retrieving an element from an ArrayList is so fast:
         given the location of the start of the ArrayList,
         you can know exactly where any element is located in memory.
         */

        l.add(s2);
        l.add(s1);
        l.add(s);
        l.add(s3);
        l.add(s4);

        List<Students> ll = new LinkedList<>();
        // LinkedList is better for manipulating data
       /* LinkedLists, on the other hand, use non-contiguous memory.
            There is no guarantee that two elements “next” to each other in a LinkedList are actually physically close in memory.

        This is why retrieving an element from a LinkedList is slower:
        you need to traverse the list using pointers, instead of automatically predicting where the element is located.*/

        ll.add(s2);
        ll.add(s1);
        ll.add(s);
        ll.add(s3);
        ll.add(s4);


        System.out.println("Student of ArrayList "  + l);


        System.out.println("Student of LinkedList "  + ll);

    }




}
