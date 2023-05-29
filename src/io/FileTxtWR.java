package io;

import java.io.*;

public class FileTxtWR {

    public void readFile(String path) {
        Reader reader = null;
        try{
            File f = new File(path);
            reader = new FileReader(f);
            byte[] b = new byte[1024];
            int ch = 0;
            while ((ch = reader.read()) != -1) {
                System.out.print((char)ch);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭流文件
            if (reader != null) {
                try {
                    reader.close();;
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void writerFile(){
        Writer writer = null;
        try {
            //打开文件
            File f = new File("data/data/file/demo3.txt");
            if (!f.exists()) {
                f.createNewFile();
            }

            //初始化文件流
            writer = new FileWriter(f);
            writer.write("this is a new file by created");
            writer.append("the content part go to append");

        }catch (Exception e) {
            e.printStackTrace();
        }finally {

            //关闭流文件
            if (writer != null) {
                try {
                    writer.close();;
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void StreamToByt() {
        //字节流转字符流
        FileInputStream f = null; //字节输入流
        InputStreamReader s = null; //字符输入流
        try{
            File file = new File("data/data/file/demo3.txt");
            f = new FileInputStream(file);
            s = new InputStreamReader(f, "UTF-8");

            //使用缓冲区
            StringBuilder buf = new StringBuilder();
            while (s.ready()) {

                //加入缓冲区
                buf.append((char)s.read());
            }
            System.out.println(buf);

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (f != null){
                    f.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if (s != null){
                    s.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    //按行读取文件
    public void readLine(){
        Reader reader = null;
        BufferedReader buf = null;
        try {
            File file = new File("data/data/file/demo4.java");
            reader = new FileReader(file);
            buf = new BufferedReader(reader);
            String line = null;
            while ((line = buf.readLine()) != null) {
                System.out.println(line);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(reader != null) {
                    reader.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if(buf != null) {
                    buf.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FileTxtWR f = new FileTxtWR();
//        f.readFile("data/data/file/demo3.txt");
//        f.StreamToByt();
        f.readLine();
    }
}
