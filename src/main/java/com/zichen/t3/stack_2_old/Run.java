package com.zichen.t3.stack_2_old;

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
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        P_Thread tp = new P_Thread(p);
        tp.start();
        C_Thread tC1 = new C_Thread(c1);
        C_Thread tC2 = new C_Thread(c2);
        C_Thread tC3 = new C_Thread(c3);
        C_Thread tC4 = new C_Thread(c4);
        C_Thread tC5 = new C_Thread(c5);
        tC1.start();
        tC2.start();
        tC3.start();
        tC4.start();
        tC5.start();
    }
}