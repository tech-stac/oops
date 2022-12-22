package threads;

public class Raushan extends Thread {


    public Raushan(String name){
        super(name);
    }
    public void run()
    {
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is Daemon thread");
        }
        else
        {
            System.out.println(getName() + " is User thread");
        }
    }

    public static void main(String[] args) {

        Raushan r = new Raushan("Thread - 1");
        r.setDaemon(true); // r is an daemon thread
        r.start();
        Raushan r2 = new Raushan("Thread - 2");
        r2.start();
    }


}
