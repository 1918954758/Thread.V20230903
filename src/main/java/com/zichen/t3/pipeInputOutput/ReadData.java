package com.zichen.t3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @Name: ReadData
 * @Description: TODO
 * @User: xdSun
 * @Date: 2023/04/30 19:26:45
 * @Version: 1.0
 **/
public class ReadData {
    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read :");
            byte[] byteArray = new byte[20];
            int readLength = input.read(byteArray);
            while (readLength != -1) {
                String newData = new String(byteArray, 0, readLength);
                System.out.print(newData);
                // 如果 input 中没有数据，则此处会阻塞，等待有数据，再开始读取
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}