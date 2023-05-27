package warrpp.prog;

public class WarrpString {
    public static void main(String[] args) {
        //将基本数据类型转换为字符串
        int t1 = 2;
        String str1 = Integer.toString(t1);
        System.out.println("t1:"+t1+"str1:"+str1);

        //字符串转为基本数据类型
        //1、包装类的parseInt
        int t2 = Integer.parseInt(str1);
        System.out.println(t2+t2);

        int t3 = Integer.valueOf(str1);
        System.out.println(t3+t3);
    }
}
