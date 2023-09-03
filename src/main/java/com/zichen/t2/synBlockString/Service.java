package com.zichen.t2.synBlockString;

/**
 * @Name: Service
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/16 15:59:35
 * @Version: 1.0
 **/
public class Service {
    private String username;
    private String password;
//    private String anyString = new String();
    public void setUsernamePassword(String username, String password) {
        String anyString = new String();
        try {
            synchronized(anyString) {
                System.out.println(" 线程名称为： " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 进入同步代码块");
                Thread.sleep(3000);
                System.out.println(" 线程名称为： " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 离开同步代码块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}