package com.zichen.t2.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * @Name: MyOneList
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 18:21:35
 * @Version: 1.0
 **/
public class MyOneList {
    private List list = new ArrayList();
    synchronized public void add(String data) {
        list.add(data);
    }
    synchronized public int getSize() {
        return list.size();
    }
}