package com.zichen.t3.twoThreadData;

/**
 * @Name: ThreadB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 22:03:46
 * @Version: 1.0
 **/
public class ThreadB extends Thread {
    private MyList list;
    ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (list.size() == 5) {
                    System.out.println(" == 5 了，线程 B 要退出了！");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}