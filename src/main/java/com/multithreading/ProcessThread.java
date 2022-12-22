package com.multithreading;

public class ProcessThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("Child thread will called first");
        }
    }
}
