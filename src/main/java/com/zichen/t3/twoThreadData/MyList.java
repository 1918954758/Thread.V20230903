package com.zichen.t3.twoThreadData;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Name: MyList
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/23 22:00:48
 * @Version: 1.0
 **/
public class MyList {
    volatile private List<String> list = new ArrayList();
    public void add() {
        list.add(" 子辰 ");
    }
    public int size() {
        return list.size();
    }
}