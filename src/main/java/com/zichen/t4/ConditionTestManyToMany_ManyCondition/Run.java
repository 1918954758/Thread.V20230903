package com.zichen.t4.ConditionTestManyToMany_ManyCondition;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/05/03 00:57:28
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA[] arrA = new ThreadA[5];
        ThreadB[] arrB = new ThreadB[5];
        for (int i = 0; i < 5; i++) {
            arrA[i] = new ThreadA(service);
            arrB[i] = new ThreadB(service);
            arrA[i].start();
            arrB[i].start();
        }
    }
}