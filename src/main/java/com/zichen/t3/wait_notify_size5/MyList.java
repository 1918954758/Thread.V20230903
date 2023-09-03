package com.zichen.t3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Name: MyList
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/25 18:45:56
 * @Version: 1.0
 **/
public class MyList {
    private static List<String> list = new ArrayList<>();
    public static void add() {
        list.add("anyString");
    }
    public static int size() {
        return list.size();
    }
}