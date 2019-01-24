package ca.laurentian_17;

public class SetThread implements Runnable {
    private Student s;
    private int x = 0;

    public SetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                // 判断有没有
                if (s.flag) {
                    try {
                        s.wait();// t1等着，释放锁, 将来醒过来的时候，是从这里醒过来的时候
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (x % 2 == 0) {
                    s.name = "林青霞";
                    s.age = 27;
                } else {
                    s.name = "刘意";
                    s.age = 30;
                }
                x++; // x=1

                // 修改标记
                s.flag = true;
                // 唤醒线程
                s.notify();// 唤醒t2, 唤醒并不表示你立马可以执行, t2必须还得抢CPU的执行权。
            }
        }
    }
}
