package ca.laurentian_02;

/*
 * 需求：我们要实现多线程的程序。
 * 如何实现呢?
 * 		由于线程是依赖进程而存在的，所以我们应该先创建一个进程出来。
 * 		而进程是由系统创建的，所以我们应该去调用系统功能创建一个进程。
 * 		Java是不能直接调用系统功能的，所以，我们没有办法直接实现多线程程序。
 * 		但是呢?Java可以去调用C/C++写好的程序来实现多线程程序。
 * 		由C/C++去调用系统功能创建进程，然后由Java去调用这样的东西，
 * 		然后提供一些类供我们使用。我们就可以实现多线程程序了。
 *
 * 那么Java提供的类是什么呢?
 * 		Thread
 * 		通过查看API，我们知道了有2种方式实现多线程程序。
 *
 * 方式1：继承Thread类。
 * 步骤
 * 		A:自定义类MyThread继承Thread类。
 * 		B:MyThread类里面重写run()?
 * 			为什么是run()方法呢?
 * 		C:创建对象
 * 		D:启动线程
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        // 创建两个线程对象
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        my1.start();
        my2.start();
    }
}
