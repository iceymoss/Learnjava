package io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLCollection {
    public static void main(String[] args) {
        InputStream is = null;  //读文件流
        OutputStream out = null; //写文件读
        try{
            String u = "https://www.bing.com/images/search?view=detailV2&ccid=4HdZ0NNG&id=B7A9D7B868716419C5DF59C8AD9B829D73A32BEC&thid=OIP.4HdZ0NNGVyiLQOdtJTMU5wHaE5&mediaurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.e07759d0d34657288b40e76d253314e7%3frik%3d7Cujc52Cm63IWQ%26riu%3dhttp%253a%252f%252fwww.rmzxb.com.cn%252fupload%252fresources%252fimage%252f2020%252f09%252f10%252f2434929.jpg%26ehk%3dUOOHp%252bPAbJmcE5GXtcleUrXjIxNZi8iljALCMVnV%252by4%253d%26risl%3d1%26pid%3dImgRaw%26r%3d0&exph=3264&expw=4928&q=%e7%86%8a%e7%8c%ab%e6%91%84%e5%bd%b1&simid=608042523505486133&FORM=IRPRST&ck=4D371B6FD4F96D773BBF237EDB74B640&selectedIndex=0&ajaxhist=0&ajaxserp=0";
            URL url = new URL(u);

            //建立连接
            URLConnection collection = url.openConnection();

            //获取文件流
            is = collection.getInputStream();

            //写文件流
            out = new FileOutputStream("data/data/file/cut.jpg");
            byte[] b = new byte[1024];
            int len;
            while ((len = is.read(b)) != -1) {

                //写入文件
                out.write(b, 0, len);
            }

        }catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(is != null) {
                    is.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
            try{
                if(out != null) {
                    out.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
