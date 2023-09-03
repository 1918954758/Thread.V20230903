package com.zichen.t1.t17;

/**
 * @Name: MyThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/09 20:58:41
 * @Version: 1.0
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            // 放弃当前CUP资源，让其他任务执行
            // 放弃的时间不确定
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时： " + (endTime - beginTime) + "毫秒！");
    }
}