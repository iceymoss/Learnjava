import java.util.Scanner;

public class CirculateDemo {

    public static void main(String[] args) {
        //while的使用
        int i = 10;
        while(i > 0) {
            System.out.println(i);
            i--;
        }


        char ch = 'a';
        int count = 1;
        while(ch <= 'z') {
            System.out.print(ch+" ");
            if (count%13 == 0) {
                System.out.println();
            }
            count++;
            ch++;
        }


        int sum = 0;
        int num = 0;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("sum:"+sum);


        //do-while的使用
        int t = 0;
        int sum0 = 0;
        do{
            sum0 += t;
            t++;
        }while (t <= 100);
        System.out.println("sum0:"+sum0);


        int tag = ((int)Math.random()*10+1);
        int ints;
        do{
            Scanner in = new Scanner(System.in);
            ints = in.nextInt();
            if (tag > ints) {
                System.out.println("太小了");
            }else if (tag < ints) {
                System.out.println("太大了");
            }
        }while (tag != ints);
        System.out.println("恭喜你，猜中了！答案是："+tag);


        //for的使用
        int sum2 = 0;
        for(int j = 0; j <= 100; j++) {
            sum2 += j;
        }
        System.out.println(sum2);

        int k = 0;
        for(; k < 10; k++) {
            System.out.println(k);
        }

        k = 0;
        for(;; k++) {
            if(k == 10) {
                break;
            }
            System.out.println(k);
        }

        for(int m = 0; m < 4; m++) {
            System.out.println();
            for(int v = 0; v < 4; v++) {
                System.out.print("*");
            }
        }





    }
}
