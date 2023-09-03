package com.zichen.t2.volatileKeyWord.synchronizedUpdateNewValue;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 18:04:15
 * @Version: 1.0
 **/
public class Service {
    private boolean isContinueRun = true;
    private String anyString = new String();
    public void runMethod() {
        while (isContinueRun) {
            synchronized(anyString) {}
        }
        System.out.println(" 停下来了！");
    }
    public void stopMethod() {
        isContinueRun = false;
    }
    public void getIsContinueRun() {
        System.out.printf(" 线程停止标志已经被改变 %b", isContinueRun);
    }
}