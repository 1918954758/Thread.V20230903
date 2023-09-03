package com.zichen.t2.volatileKeyWord.volatileTestThread;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 22:32:33
 * @Version: 1.0
 **/
public class MyThread extends Thread {
    volatile public static int count;
    synchronized private static void addCount() {
        for (int i = 0; i < 100; ++i) {
            count++;
        }
        System.out.print("count = " + count + "; ");
    }

    @Override
    public void run() {
        addCount();
    }
}