package com.forloopQuestions;


import java.util.HashMap;

public class ZerosMoves {

    public static void occurenceOfCharatcer(String str){
        HashMap<Character, Integer> map = new HashMap();
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "amar";
        occurenceOfCharatcer(s);
    }



//
    //1101001

   // output = 0001111
    //int a[] = {1,1,}
}
