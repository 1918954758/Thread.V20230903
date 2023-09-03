package com.zichen.t2.volatileKeyWord.t16;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 20:14:49
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            RunThread runThread = new RunThread();
            Thread thread = new Thread(runThread);
            thread.setName("AAAAAA");
            thread.start();
            Thread.sleep(1000);
            runThread.setRunning(false);
            System.out.println(" 已经赋值为 false");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}