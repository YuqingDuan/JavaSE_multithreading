package ca.laurentian_03;

public class MyThread extends Thread {
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(this.getName() + ":" + x);
        }
    }
}
