package by.kursy.buyel.javalessons.lesson33.model;

import java.util.concurrent.TimeUnit;

public class FourthThread implements Runnable{
    private Thread thread;
    public FourthThread(){
        thread = new Thread(this);
        thread.start();
    }

    public Thread getThread(){
        return thread;
    }

    @Override
    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 100; i++) {
            System.out.printf("Child thread %s is running ...\n", name);
            try {
                //Thread.sleep(1000);
                TimeUnit.MILLISECONDS.sleep(1);
            }catch (InterruptedException exception){
                System.out.println(exception);

            }
        }
    }
}
