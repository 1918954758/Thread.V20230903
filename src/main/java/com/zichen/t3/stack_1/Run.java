package com.zichen.t3.stack_1;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 13:51:39
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        P_Thread tp = new P_Thread(p);
        tp.start();
        C_Thread tc = new C_Thread(c);
        tc.start();
    }
}