package com.overridding.methodResolution;

public class Child extends Parent {

    int i = 10;
    public void marry(){
        System.out.println("Child class : marry() method will call based on child constructor initialisation");
    }
}
