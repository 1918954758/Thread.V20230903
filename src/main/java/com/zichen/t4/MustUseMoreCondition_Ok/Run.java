package com.zichen.t4.MustUseMoreCondition_Ok;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/02 21:38:55
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        System.out.println(" start signal A");
        service.signalAll_A();
        Thread.sleep(5000);
        System.out.println(" start signal B");
        service.signalAll_B();
    }
}