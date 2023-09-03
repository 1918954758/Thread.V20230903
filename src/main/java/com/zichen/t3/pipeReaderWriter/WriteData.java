package com.zichen.t3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @Name: WriteData
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 19:53:17
 * @Version: 1.0
 **/
public class WriteData {
    public void writeMethod(PipedWriter out) {
        try {
            System.out.println(" write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}