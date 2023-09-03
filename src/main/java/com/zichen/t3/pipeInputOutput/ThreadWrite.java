package com.zichen.t3.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * @Name: ThreadWrite
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 19:31:27
 * @Version: 1.0
 **/
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;
    ThreadWrite (WriteData write, PipedOutputStream out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}