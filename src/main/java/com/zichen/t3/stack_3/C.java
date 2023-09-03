package com.zichen.t3.stack_3;

/**
 * @Name: C
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 13:48:29
 * @Version: 1.0
 **/
public class C {
    private MyStack myStack;
    C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {
        String pop = myStack.pop();
        System.out.println("pop = " + pop);
    }
}