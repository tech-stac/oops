package com.multithreading;

public class RunnableMain {

    public static void main(String[] args) {

        ProcessRunnable pr = new ProcessRunnable();
    /*   where  pr is a type of runnable so that we will pass
        the reference of runnable inside the thread constructor
        why because thread class has
            below constructor
        public Thread(Runnable target) {
            this(null, target, "Thread-" + nextThreadNum(), 0);
        }

        which means we are good to pass the runnable object inside parametrized
        thread constructor which accepting the
        runable as a target.
        */

        Thread t = new Thread(pr);
        t.start();
        for(int i=0;i<5;i++)
        {
            System.out.println(" Main method itself have a Daemon Thread");

        }
    }
}
