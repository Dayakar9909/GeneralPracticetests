package ExamplesOfMultiThreading;

public class ThreadDemo extends Thread{


    public void run() {
        System.out.println("Run method is Overridden here........");
    }

    @Override
    public synchronized void start() {
        System.out.println("This is runnable class...............");
    }

    public static void main(String[] args) {

        ThreadDemo td = new ThreadDemo();
                td.run();
                td.start();


    }

}
