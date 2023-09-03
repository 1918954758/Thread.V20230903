package com.zichen.t2.t9;

/**
 * @Name: MyService
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 18:22:46
 * @Version: 1.0
 **/
public class MyService {
    public void addServiceMethod(MyOneList list, String data) {
        try {
            synchronized(list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);// 模拟从远程话费2秒取回数据
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}