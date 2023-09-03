package com.zichen.t2.synBlockString2;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 16:18:02
 * @Version: 1.0
 **/
public class Service {
    private String anyString = new String();
    public void a() {
        try {
            synchronized(anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a   end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void b() {
        System.out.println("b begin");
        System.out.println("b   end");
    }
}