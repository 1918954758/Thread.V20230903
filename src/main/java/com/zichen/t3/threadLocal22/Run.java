package com.zichen.t3.threadLocal22;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 16:51:11
 * @Version: 1.0
 **/
public class Run {
    public static ThreadLocalExt t1 = new ThreadLocalExt();
    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println(" 从未放过值 ");
            t1.set(" 我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}