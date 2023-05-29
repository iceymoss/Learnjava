package io;

import java.io.File;

public class FileDemo {
    //文件and目录的操作
    public static void main(String[] args) {
        File f = new File("data/data2.txt");
        File d = new File("data/data/file/");

        try{
            boolean b = f.createNewFile();

            //f.exists()查看当前是否存在
            System.out.println(f.exists());
            System.out.println(f.isDirectory());
            System.out.println(f.isFile());
            System.out.println("返回文件大小"+f.length());
            System.out.println("文件创建成功:"+b);
            System.out.println("移除文件:"+f.delete());
            System.out.println("创建目录："+d.mkdirs());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
