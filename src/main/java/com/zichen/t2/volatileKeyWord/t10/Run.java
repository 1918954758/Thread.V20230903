package com.zichen.t2.volatileKeyWord.t10;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 17:16:59
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        PrintString service = new PrintString();
        new Thread(service).start();
        System.out.println(" 我要停止它！ stopThread = " + Thread.currentThread().getName());
        service.setContinuePrint(false);
    }
}