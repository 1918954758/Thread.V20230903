package com.zichen.t2.volatileKeyWord.volatileTestThread;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 22:35:19
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; ++i) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i < 100; ++i) {
            myThreads[i].start();
        }
    }
}