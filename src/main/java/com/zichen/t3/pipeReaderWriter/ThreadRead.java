package com.zichen.t3.pipeReaderWriter;


import java.io.PipedReader;

/**
 * @Name: ThreadRead
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 19:33:04
 * @Version: 1.0
 **/
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader input;
    ThreadRead (ReadData read, PipedReader input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}