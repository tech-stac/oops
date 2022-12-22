package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {

    public static void getAll() {

        List<ModelObj> items = Arrays.asList(
                new ModelObj("Asia", "India"),
                new ModelObj("Asia", "Japan"),
                new ModelObj("Africa", "Algeria"),
                new ModelObj("APAC", "Algeria"),
                new ModelObj("APAC", "India"),
                new ModelObj("Europe", "Austria"),
                new ModelObj("Africa", "Egypt"),
                new ModelObj("Europe", "Germany")
        );

        Map<String, Set<String>> result = items.stream().collect(
            Collectors.groupingBy(ModelObj::getRegion,  Collectors.mapping(ModelObj::getCountry , Collectors.toSet()))
        );

        System.out.println("Data " + result);

    }

    public static int getSecondLarget(int[] a) {

        int dum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    dum = a[i];
                    a[i] = a[j];
                    a[j] = dum;
                }
            }
        }

        return a[a.length - 2];
    }

    public static void main(String[] args) {

        int a[] = {20, 10, 5, 12, 20};
       System.out.println("Second Highest " + getSecondLarget(a));
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        System.out.println(high2 +" "+high1);
        getAll();
    }
}