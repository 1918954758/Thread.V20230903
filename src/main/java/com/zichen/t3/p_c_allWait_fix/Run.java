package com.zichen.t3.p_c_allWait_fix;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 11:46:55
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String();
        P p = new P(lock);
        C c = new C(lock);

        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] cThread = new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName(" 生产者 " + (i + 1));
            cThread[i] = new ThreadC(c);
            cThread[i].setName(" 消费者 " + (i + 1));
            pThread[i].start();
            cThread[i].start();
        }
        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);// 将线程复制到线程组中
        System.out.printf(" threadArray.size = %d\n", threadArray.length);
        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(" " + threadArray[i].getName() + " " + threadArray[i].getState());
        }
    }
}