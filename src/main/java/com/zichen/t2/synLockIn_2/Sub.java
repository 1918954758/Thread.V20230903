package com.zichen.t2.synLockIn_2;

/**
 * @Name: Sub
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/15 19:33:57
 * @Version: 1.0
 **/
public class Sub extends Main{
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i = " + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}