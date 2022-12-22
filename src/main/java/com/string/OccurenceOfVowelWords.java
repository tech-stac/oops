package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfVowelWords {

    public static void occurenceOfVowelWordsFromString(String str){

        Map<Character, Integer> mapOfVowelWords = new LinkedHashMap<>();

        mapOfVowelWords.put('A', 0);
        mapOfVowelWords.put('E', 0);
        mapOfVowelWords.put('I', 0);
        mapOfVowelWords.put('O', 0);
        mapOfVowelWords.put('U', 0);

        for (int i = 0; i <= str.length()-1; i++){
            if (mapOfVowelWords.containsKey(str.charAt(i))){
                int count = mapOfVowelWords.get(str.charAt(i));
                mapOfVowelWords.put(str.charAt(i), ++count);
            }
        }
        System.out.println(mapOfVowelWords);
    }
    public static void main(String[] args) {
        String str = "AMAR";
        occurenceOfVowelWordsFromString(str);
    }
}
