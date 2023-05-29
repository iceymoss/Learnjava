package io;

import java.io.*;

public class FileCopyDemo {
    //文件的读取，字节输入输出流：不可直接读取的二进制流
    public static void main(String[] args) {
        File f = new File("data/data/file/dmo1.txt");
        File f1 = new File("data/data/file/demo2.txt");
        InputStream is = null;
        OutputStream out = null;
        try {
            //获取文件句柄
             is = new FileInputStream(f);

             out = new FileOutputStream(f1);

             //没一次读取文件的1024个字节
             byte[] bt = new byte[1024];
             int len;
             while ((len = is.read(bt)) != -1) {

                 //写入数据流
                 out.write(bt, 0, len);
             }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭文件
            if(out != null) {
                try {
                    out.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(is != null) {
                try {
                    is.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}