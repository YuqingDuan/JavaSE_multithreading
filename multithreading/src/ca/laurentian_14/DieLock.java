package ca.laurentian_14;

// 死锁的一个最简单的例子
public class DieLock extends Thread {
    private boolean flag;

    public DieLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (MyLock.objA) {
                System.out.println("if objA");
                synchronized (MyLock.objB) {
                    System.out.println("if objB");
                }
            }
        } else {
            synchronized (MyLock.objB) {
                System.out.println("if objA");
                synchronized (MyLock.objA) {
                    System.out.println("if objB");
                }
            }
        }
    }
}
