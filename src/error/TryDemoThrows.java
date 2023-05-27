package error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThrows {

    //throws：将可能出现的异常交给调用者处理
    public static int test() throws ArithmeticException, InputMismatchException {
       //抛出异常
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("res:" + (input1.nextInt() / input2.nextInt()));
        return input1.nextInt() / input2.nextInt();
    }

    public static int test1() throws Exception {
        //抛出异常
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("res:" + (input1.nextInt() / input2.nextInt()));
        return input1.nextInt() / input2.nextInt();
    }

    public static void main(String[] args) {
        try {
            int res = test();
        }catch (ArithmeticException e) {
            System.out.println("算法错误");
            e.printStackTrace();
        }catch (InputMismatchException e) {
            System.out.println("请输入数字类型");
            e.printStackTrace();
        }

        try {
            int res1 = test1();
        }catch (ArithmeticException e) {
            System.out.println("算法错误");
            e.printStackTrace();
        }catch (InputMismatchException e) {
            System.out.println("请输入数字类型");
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println("其他错误");
        }


    }
}
