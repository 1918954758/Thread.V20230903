package com.zichen.t2.syn_out_asyn;


/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 16:55:35
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyList list = new MyList();
        MyThreadA threadA = new MyThreadA(list);
        threadA.setName("A");
        threadA.start();
        MyThreadB threadB = new MyThreadB(list);
        threadB.setName("B");
        threadB.start();
    }
}