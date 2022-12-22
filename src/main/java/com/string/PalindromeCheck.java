package com.string;

public class PalindromeCheck {


    public static boolean isPalindrom(String s){

        boolean flag = false;
        String data = "";
        for (int i = s.length()-1; i >= 0; i--){
            data = data + s.charAt(i);
        }
        if (s.equals(data)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "amaa";
        boolean b = isPalindrom(s);
        System.out.print(b);
    }
}
