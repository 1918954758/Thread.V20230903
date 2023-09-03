package com.zichen.t3.stack_3;

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
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);
        C c1 = new C(myStack);
        P_Thread tP1 = new P_Thread(p1);
        P_Thread tP2 = new P_Thread(p2);
        P_Thread tP3 = new P_Thread(p3);
        P_Thread tP4 = new P_Thread(p4);
        P_Thread tP5 = new P_Thread(p5);
        P_Thread tP6 = new P_Thread(p6);
        tP1.start();
        tP2.start();
        tP3.start();
        tP4.start();
        tP5.start();
        tP6.start();
        C_Thread tC1 = new C_Thread(c1);
        tC1.start();
    }
}