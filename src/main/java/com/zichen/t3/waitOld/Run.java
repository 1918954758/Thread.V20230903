package com.zichen.t3.waitOld;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 17:37:33
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");

        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);

        ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
        subtract1Thread.setName("subtract1Thread");
        subtract1Thread.start();
        ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
        subtract2Thread.setName("subtract2Thread");
        subtract2Thread.start();

        Thread.sleep(1000);

        ThreadAdd addThread1 = new ThreadAdd(add);
        addThread1.setName("addThread1");
        addThread1.start();
    }
}