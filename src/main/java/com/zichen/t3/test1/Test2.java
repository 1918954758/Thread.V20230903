package com.zichen.t3.test1;

/**
 * @Name: Test2
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/25 18:14:55
 * @Version: 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("synchronized 上面打印 ");
            synchronized (lock) {
                System.out.println(" synchronized 第一行打印 ");
                lock.wait();
                System.out.println(" wait 下一行打印 ");
            }
            System.out.println(" synchronized 下面打印 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}