package com.zichen.t2.volatileKeyWord.t10;

/**
 * @Name: PrintString
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 19:58:41
 * @Version: 1.0
 **/
public class PrintString implements Runnable{
    private boolean isContinuePrint = true;
    public void setContinuePrint(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;
    }
    public boolean isContinuePrint() {
        return isContinuePrint;
    }
    public void printStringMethod() {
        try {
            while (isContinuePrint()) {
                System.out.println("run printStringMethod threadName = " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        printStringMethod();
    }
}