package com.stringLogicalOnRealTime;

public class StringUtil {

    public static void main(String[] pas){
        String s = "abc"; // scp are special memory
        String s1 = new String("abc"); //  heap memory as well as scp area
        String s3 = "abc";
        System.out.println( s1 == s3 );
        boolean b1 = (s == s1);
        System.out.println(s.equals(s1));
        System.out.println(s == s1);
        System.out.println("equal method : " + s.equals(s1));//true
        String s2 = new String("abc");
        System.out.println("equal method " + s1.equals(s1));
        System.out.println("equal method " + s2.equals(s1));
        System.out.println(s2==s1);
        String s4 = s1.intern();
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));



    }

}
