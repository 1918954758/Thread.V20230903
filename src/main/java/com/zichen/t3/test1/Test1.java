package com.zichen.t3.test1;

/**
 * @Name: Test1
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/25 18:10:55
 * @Version: 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        try {
            String newString = new String();
            newString.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}