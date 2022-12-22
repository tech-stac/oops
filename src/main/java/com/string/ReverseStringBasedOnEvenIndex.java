package com.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringBasedOnEvenIndex {
    public static String reverse(String string) {
        return Stream.of(string)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String makeUpperCaseBasedOnEvenIndex(String reversed){
        int count = 0;
        char c1;
        char[] charArray = reverse(reversed).toCharArray();
        String str ="";
        for (char c : charArray)
        {
            count++;
            if(count%2==0){
                c1 = Character.toUpperCase(c);
                str = str + String.valueOf(c1);
            }else{
                str = str + String.valueOf(c);
            }
        }
        return str;
    }

    public static void main(String[] args) {

        System.out.println(makeUpperCaseBasedOnEvenIndex("amar"));

    }



}
