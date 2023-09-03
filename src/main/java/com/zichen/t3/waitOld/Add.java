package com.zichen.t3.waitOld;

/**
 * @Name: Add
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/29 17:24:54
 * @Version: 1.0
 **/
public class Add {
    private String lock;
    Add (String lock) {
        this.lock = lock;
    }
    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}