package error;

import java.util.Scanner;

public class Test {
    public static void testAge1()throws TryDemoMyDef{
        //抛出异常
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age < 18 || age > 80) {
            //使用自定义一个异常情况
            throw new TryDemoMyDef();
        }else {
            System.out.println("欢迎入住");
        }
    }
    public static void main(String[] args) {
        try {
            testAge1();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
