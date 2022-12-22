package com.overridding.covarientReturnType;

public class P {

    public Object m1(){

        return null;
    }

    public Object m2(){
        return null;
    }

    public Integer m3(){
        return 1;
    }

   // Before 1.4 version method return type should be same but after
    // 1.5 verion you can use different return type in case of overriding

}
