package com.overridding.methodResolution;

public class Test {

    public static void main(String[] args) {
        Parent p = new Parent();
        //p.marry();
        //p.property();

        Child c = new Child();
        //c.marry();
        //c.property();

        Parent parent =  new Child();
        parent.property();
        parent.marry();

    }
}
