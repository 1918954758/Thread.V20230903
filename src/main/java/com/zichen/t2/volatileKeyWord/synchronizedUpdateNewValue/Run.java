package com.zichen.t2.volatileKeyWord.synchronizedUpdateNewValue;

/**
 * @Name: Test
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 18:06:51
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread.sleep(1000);
        ThreadB threadB = new ThreadB(service);
        threadB.start();
        System.out.println(" 已经发起停止的命令了！ ");
        service.getIsContinueRun();
    }
}