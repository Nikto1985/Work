package by.kursy.buyel.javalessons.lesson33.model;

import java.util.concurrent.TimeUnit;

public class ThirdThead extends Thread{

    public ThirdThead(){
        start();
    }

    @Override
    public void run() {
        String name = getName();
        while(true){
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
