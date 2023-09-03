package com.zichen.t4.test7;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 21:39:00
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = service::waitMethod;
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}