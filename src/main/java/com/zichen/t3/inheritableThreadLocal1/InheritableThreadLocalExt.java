package com.zichen.t3.inheritableThreadLocal1;

import java.util.Date;

/**
 * @Name: InheritableThreadLocalExt
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/01 17:09:40
 * @Version: 1.0
 **/
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}