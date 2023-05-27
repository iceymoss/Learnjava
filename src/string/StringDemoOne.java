package string;

public class StringDemoOne {

    public static void main(String[] args) {
        String str = "java编程基础";
        System.out.println("len:"+str.length());

        //取指定下标的字符
        System.out.println("index:"+str.charAt(2));

        //求子串,以指定下标开始,取前不取后
        System.out.println(str.substring(2,4));

        //获取指定字符第一次出现的位置
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("编程"));


        //最后一次出现的位置
        System.out.println(str.lastIndexOf("a"));

        //字符串也字节数组的转换
        byte[] bytArr = str.getBytes();
//        for(int n: bytArr){
//            System.out.println(n);
//        }

        for(int i = 0; i < bytArr.length; i++) {
            System.out.print(bytArr[i]+" ");
        }

        //将byt数组转为字符串
        String str1 = new String(bytArr);
        System.out.println(str1);


        //==和equal的区别
        String s1 = "iceymoss";
        String s2 = "iceymoss";
        String  s3 = new String("iceymoss");
        System.out.println("s1==s2:"+s1==s2);

        //equals：表示内容是否相同
        System.out.println("s1==s3:"+s1.equals(s3));
        System.out.println("s1==s2:"+s1.equals(s2));

        //字符串的不可变性，字符串对象一旦被创建就不能被修改，所指向的内存空间不变
        String s4 = "iceymoss";
        String s5 = "hello"+s4; //此时s4重新指向了新的内存空间
        System.out.println("s4:"+s4);
        System.out.println("s5:"+s5);












    }
}
