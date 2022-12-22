package com.overload.string.object;

public class StringObjectOverloadExample{

    public static void method(Object o) {
        System.out.println("Object method");
    }
    public static void method(String s) {
        System.out.println("String method");
    }

    public static void method(Double s) {
        System.out.println("Integer method");
    }
     // If you overload with Integer, Float , Double parameter, this will result in compile error.
    //Between String and Object, Object is superior and String is more specific to JVM
    //so JVM will choose String however between String and Integer,
    //there is no comparison and hence JVM will get confuse and throw ambiguous error at compile time. –


    public static void main(String[] args) {
        //method(null); // String method
        method(1);// Object Method
        method('r');// Object Method
        method(10.5d);//Object method
        method("amar"); // String method
    }
}
