package com.zichen.t3.wait_notify_insert_test;

/**
 * @Name: BackupA
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 20:19:36
 * @Version: 1.0
 **/
public class BackupA extends Thread {
    private DBTools dbTools;
    BackupA (DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}