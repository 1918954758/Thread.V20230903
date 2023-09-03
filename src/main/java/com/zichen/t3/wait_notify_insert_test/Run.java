package com.zichen.t3.wait_notify_insert_test;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 20:21:09
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        int count = 1;
        DBTools dbTools = new DBTools(count);
        for (int i = 0; i < 10; i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }
}