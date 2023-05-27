package error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo {

    public static int test() {
        try { //抛出异常
            Scanner input1 = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            System.out.println("res:" + (input1.nextInt() / input2.nextInt()));
            return input1.nextInt() / input2.nextInt();
        } catch (ArithmeticException e) {  //算数异常
            System.out.println("分母不能为零");
            e.printStackTrace(); //打印错误信息
            return 0;
        }catch (InputMismatchException e) { //输入异常
            System.out.println("输入必须为数字类型");
            e.printStackTrace(); //打印错误信息
            return 0;
        }catch (Exception e) { //父异常，防止一些没有考虑到情况的发生，必须放置到最后
            System.exit(1); //程序无条件退出
            System.out.println("其他错误");
            e.printStackTrace(); //打印错误信息
            return 0;
        }finally { //一定会执行的逻辑
            System.out.println("程序运行结束，bye");
            return -1000;
        }
    }
    public static void main(String[] args) {

        System.out.println(new TryDemo().test());


//        int one = 12;
//        int tow = 13;
//        System.out.println("res:"+one/tow);

//        //使用try-catch捕捉
//        try { //抛出异常
//            Scanner input1 = new Scanner(System.in);
//            Scanner input2 = new Scanner(System.in);
//            System.out.println("res:" + (input1.nextInt() / input2.nextInt()));
//        } catch (Exception e) { //捕捉异常，处理异常
//            System.out.println("程序出错了");
//        }
//        System.out.println("程序运行结束，bye");


//        try { //抛出异常
//            Scanner input1 = new Scanner(System.in);
//            Scanner input2 = new Scanner(System.in);
//            System.out.println("res:" + (input1.nextInt() / input2.nextInt()));
//        } catch (Exception e) { //捕捉异常
//            System.out.println("程序出错了");
//            e.printStackTrace(); //打印错误信息
//        }finally { //一定会执行的逻辑
//            System.out.println("程序运行结束，bye");
//        }


        //多重捕捉
//        try { //抛出异常
//            Scanner input1 = new Scanner(System.in);
//            Scanner input2 = new Scanner(System.in);
//            System.out.println("res:" + (input1.nextInt() / input2.nextInt()));
//        } catch (ArithmeticException e) {  //算数异常
//            System.out.println("分母不能为零");
//            e.printStackTrace(); //打印错误信息
//        }catch (InputMismatchException e) { //输入异常
//            System.out.println("输入必须为数字类型");
//            e.printStackTrace(); //打印错误信息
//        }catch (Exception e) { //父异常，防止一些没有考虑到情况的发生，必须放置到最后
//            System.exit(1); //程序无条件退出
//            System.out.println("其他错误");
//            e.printStackTrace(); //打印错误信息
//        }finally { //一定会执行的逻辑
//            System.out.println("程序运行结束，bye");
//        }
    }
}

