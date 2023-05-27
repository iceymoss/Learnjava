package string;

public class StringBuilderDemo {
    //java里面有String和StringBuilder两个类，String是不可变的，
    //StringBuilder是可变的，假如我们频繁修改字符串最好使用StringBuilder
    public static void main(String[] args) {
        //没有参数，默认长度为16
        StringBuilder str = new StringBuilder("您好");
        System.out.println(str);

        str.append("，我是iceymoss");
        System.out.println(str);

        //将iceymoss变为大写
        System.out.println("替换后："+str.delete(5,13).append("ICEYMOSS"));
        System.out.println("替换后："+str.replace(5,13, "ICEYMOSS"));

        System.out.println("子串："+str.substring(0,4));
    }
}
