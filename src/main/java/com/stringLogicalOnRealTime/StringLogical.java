package com.stringLogicalOnRealTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLogical {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("Rohit Sharma");
        strList.add("Virat Kohli");
        strList.add("Rohit Kohli");
        strList.add("Ajay Verma");

        Map<String, List<String>> grouped = strList.stream().parallel()
                .map(str -> str.split(" "))
                .collect(Collectors.groupingBy(
                        a -> a[1],
                        Collectors.mapping(a -> a[0], Collectors.toList())
                ));

System.out.println(grouped);

   /*     Ouput:
        Sharma= ["Rohit"]
        Kohli= ["Virat", "Rohit"]
        Verma= ["Ajay"]*/

    }

}
