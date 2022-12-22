package com.string;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharInStringMoreThan1 {

    public static void dubliCateCharInString(String str){
        Integer bounndaryCondition = 1;
        Map<Character, Integer> map = new HashMap();
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> entryMap : map.entrySet()){
            if(entryMap.getValue() > bounndaryCondition){
                System.out.println("{" +entryMap.getKey() + " : " + entryMap.getValue() + "}");
            }
        }

    }

    public static void main(String[] args) {
        String str = "aaaaaaaaaabbbbbbbbaaaaaaacccgggssssjjjssst";
        dubliCateCharInString(str);
    }
}
