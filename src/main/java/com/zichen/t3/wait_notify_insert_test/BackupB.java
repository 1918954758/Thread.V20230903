package com.zichen.t3.wait_notify_insert_test;

/**
 * @Name: BackupB
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 20:20:45
 * @Version: 1.0
 **/
public class BackupB extends Thread {
    private DBTools dbTools;
    BackupB (DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}