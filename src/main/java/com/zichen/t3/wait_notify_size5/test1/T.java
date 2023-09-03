package com.zichen.t3.wait_notify_size5.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Name: T
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/25 18:28:32
 * @Version: 1.0
 **/
public class T {
    private List<String> list = new ArrayList();
    public void setT() {
        list.add("zichen");
    }
    public int printSize() {
        int size = list.size();
        System.out.println(" list.size() = " + size);
        return size;
    }
}