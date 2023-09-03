package com.zichen.t2.volatileKeyWord.atomicIntegerNoSafe;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 14:20:19
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            MyThread[] array = new MyThread[5];
            for (int i = 0; i < array.length; ++i) {
                array[i] = new MyThread(service);
            }
            for (MyThread myThread : array) {
                myThread.start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}