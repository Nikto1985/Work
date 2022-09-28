package by.kursy.buyel.javalessons.lesson33.controller;

import by.kursy.buyel.javalessons.lesson33.model.FourthThread;

import javax.sound.midi.Soundbank;

public class SecondController {
    public static void main(String[] args) {
        System.out.println("Main thread start.");

        int count = 5;
        FourthThread[] threads = new FourthThread[count];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new FourthThread();

        }
        for (int i = 0; i < threads.length; i++) {
            try{
                threads[i].getThread().join();
            }catch (InterruptedException exception){
                System.out.println(exception);
            }

        }


        System.out.println("Main thread finished.");
    }
}
