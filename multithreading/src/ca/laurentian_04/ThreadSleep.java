package ca.laurentian_04;

import java.util.Date;

public class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(getName() + ":" + x + ",日期：" + new Date());
            // 睡眠
            // 困了，我稍微休息3秒钟
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
