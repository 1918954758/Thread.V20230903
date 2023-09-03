package com.zichen.t2.volatileKeyWord.t99;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 17:16:59
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();;
        System.out.println(" 我要停止它！ stopThread = " + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}