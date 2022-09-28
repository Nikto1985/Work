package by.kursy.buyel.javalessons.lesson32.typeofcreatingthreads;

public class FirstThread extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("msg from child thread..");
                Thread.sleep(500);

            } catch (InterruptedException exception) {
                System.out.println("exception");
            }
        }
    }
}
