package com.zichen.t2.volatileKeyWord.t99;

/**
 * @Name: PrintString
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 17:14:40
 * @Version: 1.0
 **/
public class PrintString {
    private boolean isContinuePrint = true;
    public boolean isContinuePrint() {
        return isContinuePrint;
    }
    public void setContinuePrint(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;
    }
    public void printStringMethod() {
        while (isContinuePrint) {
            System.out.println("run printStringMethod threadName = " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}