package com.zichen.t4.test4;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/06 20:57:46
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        new Thread(service::serviceMethod).start();
    }
}