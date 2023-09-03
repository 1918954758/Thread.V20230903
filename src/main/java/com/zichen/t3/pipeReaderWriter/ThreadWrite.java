package com.zichen.t3.pipeReaderWriter;


import java.io.PipedWriter;

/**
 * @Name: ThreadWrite
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 19:31:27
 * @Version: 1.0
 **/
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedWriter out;
    ThreadWrite (WriteData write, PipedWriter out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}