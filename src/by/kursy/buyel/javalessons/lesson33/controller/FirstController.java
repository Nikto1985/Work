package by.kursy.buyel.javalessons.lesson33.controller;

import by.kursy.buyel.javalessons.lesson33.model.ThirdThead;

public class FirstController {
    public static void main(String[] args) {

        String name =  Thread.currentThread().getName();
        ThirdThead thread  = new ThirdThead();
        thread.setPriority(10);

        Thread main = Thread.currentThread();
        main.setPriority(1);

        while(true){
            try {


                System.out.printf("msg from %s thread.. \n", name);
                Thread.sleep(1);
            }catch (InterruptedException exception){
                System.out.println("exc");
            }
        }
    }
}
