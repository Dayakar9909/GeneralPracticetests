package ExamplesOfMultiThreading;

public class RunnableDemo implements Runnable{

    String name;
    RunnableDemo (String name1){
        name = name1;
    }

    public void run(){

        for (int i=1; i<=10; i++) {
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(name+ ":"+i);
            // Thread t = Thread.currentThread();
            // System.out.println(t);
        }
    }

    public static void main(String[] args) {

        RunnableDemo rd = new RunnableDemo("Thread-1");
        RunnableDemo rd2 = new RunnableDemo("Thread-2");
        Thread t1 = new Thread(rd);
        Thread t2 = new Thread(rd2);
        t1.start();
        t2.start();
        //Thread t = Thread.currentThread();
       for (int i=0; i<=10; i++){
           System.out.println(("main:"+i));
       }

    }
}
