package com.zichen.t3.ThreadLocal33;

import java.util.Date;

/**
 * @Name: ThreadLocalExt
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 16:55:57
 * @Version: 1.0
 **/
public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}