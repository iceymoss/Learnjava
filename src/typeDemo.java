import java.util.Scanner;

public class typeDemo {
    public static void main(String[] args) {
        //数值类型
        //变量
        byte b = 100;
        short s = 1000;
        int i = 10000;
        long l = 1000000000;
        float f = 1.5f;//浮点默认是double
        double d = 1.555;

        char c = 'a';
        String str = "hello,java";
        boolean isHave = true;
        System.out.println("\n" + s);

        //类型转换
        if (d > f) {
            System.out.println(d);
        }
        d = f;
        f = (float) d;
        System.out.println(f);

        //常量
        final Double PI = 3.14195;
        final int YEAS = 365;
        final int MAX_VALUE = 1000;

        //算数运算符
        int a1 = 10;
        int a2 = 7;
        float f1 = 0.75f;
        float t1 = a1 + f1;
        float t2 = a1 - f1;
        float t3 = a1 * f1;
        float t4 = a1 / f1;
        int a3 = a1 % a2;

        //自增自减
        int num1 = 10;
        int num2;
        num2 = ++num1; //num1 += 1, num2 = num1
        num2 = num1++; //num2 = num1, num1++
        num2 = --num1; //num1 -= 1, num2 = num1
        num2 = num1--; //num2 = num1, num1--
        a1++;
        a2--;

        //关系运算符
        System.out.println(4 > 1);  //true
        System.out.println(4 < 1);  //false
        System.out.println(4 >= 4); //true
        System.out.println(4 == 1); //false
        System.out.println(4 != 1); //true

        int sou = 60;
        if (s >= 60) {
            System.out.println(sou + "及格");
        } else {
            System.out.println(sou + "不及格");
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + "是偶数");
        } else {
            System.out.println(n + "是奇数");
        }

        //逻辑运算符: &&, ||, !
        Scanner scan = new Scanner(System.in);
        int sour = scan.nextInt();
        if (sour >= 90) {
            System.out.println(n + "是优秀");
        } else if (sour < 90 && sour >= 60) {
            System.out.println(sour + "及格");
        } else {
            System.out.println(sour + "不及格");
        }
    }
}
