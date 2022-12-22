package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfString {

    public static void countOfStringOccurence(String str){

        Map<Character, Integer> countOfStringOccurence = new LinkedHashMap<>();
        //for (int i = str.length() - 1; i > = 0; i--) {// rotating from right to left
        for(int i = 0; i < str.length(); i++){
            if(countOfStringOccurence.containsKey(str.charAt(i))){
                int count = countOfStringOccurence.get(str.charAt(i));
                countOfStringOccurence.put(str.charAt(i), ++count);
            }else{
                countOfStringOccurence.put(str.charAt(i), 1);
            }
        }
        System.out.println(countOfStringOccurence);
    }

    public static void main(String[] args) {
        String str = "SSDRRRTTYYTYTR";
        countOfStringOccurence(str);
    }
}
