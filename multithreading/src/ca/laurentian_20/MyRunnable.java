package ca.laurentian_20;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int x = 0; x < 500; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}
