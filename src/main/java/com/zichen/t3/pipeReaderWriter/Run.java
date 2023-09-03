package com.zichen.t3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @Name: Run
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 20:01:14
 * @Version: 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedWriter outStream = new PipedWriter();
            PipedReader inputStream = new PipedReader();

//        inputStream.connect(outStream);
            outStream.connect(inputStream);

            ThreadRead threadRead = new ThreadRead(readData, inputStream);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData, outStream);
            threadWrite.start();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}