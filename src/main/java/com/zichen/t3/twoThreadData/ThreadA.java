package com.zichen.t3.twoThreadData;

/**
 * @Name: ThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 22:02:00
 * @Version: 1.0
 **/
public class ThreadA extends Thread {
    private MyList list;
    ThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                list.add();
                System.out.println(" 添加了 " + (i + 1) + " 个元素 ");
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}