package com.multithreading;

public class ProcessRunnable implements Runnable{
    @Override
    public void run() { // run of runnable
        for(int i=0;i<5;i++)
        {
            System.out.println("Child thread will called first");
        }

    }
}
