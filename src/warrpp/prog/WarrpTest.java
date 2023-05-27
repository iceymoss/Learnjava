package warrpp.prog;

public class WarrpTest {
    public static void main(String[] args) {
        //装箱：把基本数据类型转为包装类
        //1、自动装箱
        int t1 = 1;
        Integer t2 = t1;
        System.out.println("t1:"+t1+"t2:"+t2);

        //2、手动装箱
        Integer t4 = Integer.valueOf(t1);

        //拆箱
        //1、自动
        int t5 = t2;
        System.out.println("t4:"+t4+"t5:"+t5);

        //2、手动拆箱
        int t6 = t2.intValue();
        System.out.println("t6:"+t6+"t2:"+t2);










    }
}
