package com.zichen.t3.stack_4;

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
        new P_Thread(p1).start();
        new P_Thread(p2).start();
        new P_Thread(p3).start();
        new P_Thread(p4).start();
        new P_Thread(p5).start();
        new P_Thread(p6).start();

        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        C c6 = new C(myStack);
        C c7 = new C(myStack);
        C c8 = new C(myStack);
        new C_Thread(c1).start();
        new C_Thread(c2).start();
        new C_Thread(c3).start();
        new C_Thread(c4).start();
        new C_Thread(c5).start();
        new C_Thread(c6).start();
        new C_Thread(c7).start();
        new C_Thread(c8).start();
    }
}