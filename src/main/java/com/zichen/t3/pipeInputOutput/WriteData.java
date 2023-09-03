package com.zichen.t3.pipeInputOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @Name: WriteData
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 19:23:33
 * @Version: 1.0
 **/
public class WriteData {
    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}