package com.zichen.t3.threadLocal22;

/**
 * @Name: ThreadLocalExt
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 16:49:10
 * @Version: 1.0
 **/
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return " 我是默认值，第一次 get 不再为 null ";
    }
}