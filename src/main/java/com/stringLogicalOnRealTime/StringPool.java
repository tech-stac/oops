package com.stringLogicalOnRealTime;

import org.openjdk.jol.vm.VM;

public class StringPool {

    public static void main(String[] args) {


        String s = "abc";
        String s1 = "abc";

        System.out.println("#### literals case of String with double equal operator  and equals ###");
        System.out.println("Memory reference of string object literal s :  " + VM.current().addressOf(s)); // 32345343232
        System.out.println("Memory reference of string object literal s1 :  " + VM.current().addressOf(s1));// 32345343392
        System.out.println(" S object hash code " + s.hashCode()); // 96354
        System.out.println(" S1 object hash code " + s1.hashCode()); //96354
        System.out.println(s == s1);//true
        System.out.println(s.equals(s1)); // true


        String s2 = new String("abc");
        String s3 = new String("abc");


        System.out.println("#### new keyword case of String with double equal operator and equals ###");
        System.out.println("Memory reference of string object s2 :  " + VM.current().addressOf(s2)); // 32339443368
        System.out.println("Memory reference of string object s3 :  " + VM.current().addressOf(s3));// 32339443392
        System.out.println(" S2 object hash code : " + s2.hashCode()); // 96354
        System.out.println(" S3 object hash code  : " + s3.hashCode()); //96354
        System.out.println(s2 == s1); // false
        // == operator always compare memory reference here we have  different references  32339443392 / 32339443368
        System.out.println(s2 == s3); // false
        // == operator always compare memory reference here we have  different references 32339443392 / 32339443368
        System.out.println(s2.equals(s3));// true
        // here .euals opereator are comparing hashcode if both are same then we will get true , hashcode are sa,e
        // but basically content should be same only which is ""abc"" are having with both one



        StringBuffer s4 = new StringBuffer("abc");
        StringBuffer s5 = new StringBuffer("abc");

        System.out.println("#### new keyword case of String & StringBuffer with double equal operator and equals ###");
        System.out.println("Memory reference of string object s4 :  " + VM.current().addressOf(s4)); // 32339443368
        System.out.println("Memory reference of string object s5 :  " + VM.current().addressOf(s5)); // 32339443392
        System.out.println(" S4 object hash code : " + s4.hashCode()); // 540642172
        System.out.println(" S5 object hash code  : " + s5.hashCode()); //1875308878
        // System.out.println(s4 == s3); // == operator cannot be applied to stringbuffer or string compile time error
        System.out.println(s4 == s5);
        // equal operator always compare memory reference here we have  different references 32339456024 / 32339456096
        System.out.println(s4.equals(s5)); //
        System.out.println(s3.equals(s4));//
        System.out.println(s2.equals(s4));//
        System.out.println(s1.equals(s4));//



    }



}
