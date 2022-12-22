package com.multithreading;

public class MainProcess {

    public static void main(String[] args) {
        ProcessThread pt = new ProcessThread(); // Instantiation of a thread
        pt.start(); // starting of thread
        for(int i=0;i<5;i++)
        {
            System.out.println(" Main method itself have a Daemon Thread");

        }

    }
}
