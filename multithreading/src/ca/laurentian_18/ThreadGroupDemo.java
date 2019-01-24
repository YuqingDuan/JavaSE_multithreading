package ca.laurentian_18;

/*
 * 线程组： 把多个线程组合到一起。
 * 它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my, "林青霞");
        Thread t2 = new Thread(my, "刘意");

        // 我不知道他们属于哪个线程组,我想知道，怎么办
        // 线程类里面的方法：public final ThreadGroup getThreadGroup()
        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t2.getThreadGroup();
        // 线程组里面的方法：public final String getName()
        String name1 = tg1.getName();
        String name2 = tg2.getName();
        System.out.println(name1);
        System.out.println(name2);

        // 通过结果我们知道了：线程默认情况下属于main线程组
        // 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
        // 链式编程
        System.out.println(Thread.currentThread().getThreadGroup().getName());
    }
}
