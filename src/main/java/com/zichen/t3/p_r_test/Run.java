package com.zichen.t3.p_r_test;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 11:16:09
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        String lock = new String();
        P p = new P(lock);
        C c = new C(lock);
        ThreadP threadP = new ThreadP(p);
        threadP.start();
        ThreadC threadC = new ThreadC(c);
        threadC.start();
    }
}