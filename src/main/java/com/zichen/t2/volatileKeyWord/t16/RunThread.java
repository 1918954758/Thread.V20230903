package com.zichen.t2.volatileKeyWord.t16;

/**
 * @Name: RunThread
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/22 20:12:47
 * @Version: 1.0
 **/
public class RunThread extends Thread {
    private boolean isRunning = true;
    public boolean isRunning () {
        return isRunning;
    }
    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
    @Override
    public void run() {
        super.run();
        System.out.println(" 进入 run 了");
        while (isRunning()) {}
        System.out.println(" 线程被停止了！");
    }
}