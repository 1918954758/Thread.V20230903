package com.zichen.t2.syn_out_asyn;

/**
 * @Name: MyThreadA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 16:53:53
 * @Version: 1.0
 **/
public class MyThreadA extends Thread {
    private MyList list;
    MyThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadA " + (i + 1));
        }
    }
}