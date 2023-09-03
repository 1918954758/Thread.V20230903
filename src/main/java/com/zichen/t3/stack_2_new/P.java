package com.zichen.t3.stack_2_new;

/**
 * @Name: P
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 13:47:28
 * @Version: 1.0
 **/
public class P {
    private MyStack myStack;
    P (MyStack myStack) {
        this.myStack = myStack;
    }
    public void pushService() {
        myStack.push();
    }
}