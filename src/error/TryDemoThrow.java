package error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThrow {

    //throw:1、自己抛出异常自己处理；
    public static void testAge(){
        //抛出异常
        try {
            Scanner in = new Scanner(System.in);
            int age = in.nextInt();
            if(age < 18 || age > 80) {
                //返回一个异常情况
                throw new Exception("18岁以下或者80岁以上必须由亲友陪同入住");
            }else {
                System.out.println("欢迎入住");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    //throw:2、抛给调用者；
    public static void testAge1()throws Exception{
        //抛出异常
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age < 18 || age > 80) {
            //自定义一个异常情况
            throw new Exception("18岁以下或者80岁以上必须由亲友陪同入住");
        }else {
            System.out.println("欢迎入住");
        }
    }


    //自定义异常


    public static void main(String[] args) {
//        testAge();

        try {
            testAge1();
        }catch (Exception e) {
            System.out.println("禁止入住");
            e.printStackTrace();
        }
    }

}
