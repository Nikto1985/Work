package by.kursy.buyel.javalessons.lesson32.typeofcreatingthreads;

import by.kursy.buyel.javalessons.lesson20.model.entity.figure.Triangle;

public class Controller {
    public static void main(String[] args){
        FirstThread thread = new FirstThread();
        thread.start();
        String name =  Thread.currentThread().getName();

        while(true){
            try {


                System.out.printf("msg from %s thread.. \n", name);
                Thread.sleep(500);
            }catch (InterruptedException exception){
                System.out.println("exc");
            }
        }
    }



}
