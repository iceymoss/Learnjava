package polymor.telphone;

import javax.swing.plaf.PanelUI;

//使用关键字：implements来表明要实现接口
public class ThrPhone extends SecondPhone implements IPhone {
    public void video() {
        System.out.println("看视频");
    }

    public void music() {
        System.out.println("听音乐");
    }


    //实现接口的方法
    public void photo() {
        System.out.println("手机可以拍照");
    }
}
