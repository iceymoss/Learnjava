import java.util.Scanner;

public class FunctDemo {

    //无参数，无返回值的方法
    public void println() {
        System.out.println("**********");
    }

    //无参数，有返回值
    public int area() {
        int width = 100;
        int length = 200;
        return width * length;
    }

    //无返回值有参数
    public void max(int x, int y) {
        if (x > y) {
            System.out.println("max:"+x);
        }else {
            System.out.println("max:"+y);
        }
    }

    //有参数有返回值
    public int fac(int n) {
        int sum = 1;
        for(int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    //以数组作为参数
    public int[] sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int mod = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[mod] > arr[j]) {
                    mod = j;
                }
            }
            int tag = arr[i];
            arr[i] = arr[mod];
            arr[mod] = tag;
        }
        return arr;
    }

    public boolean findItem(int item, int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == item) {
                return true;
            }
        }
        return false;
    }

    public void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("排序"+arr[i]);
        }
    }

    //方法重载
    public void min(int x, int y) {
        if(x < y ) {
            System.out.println("min:"+x);
        }else {
            System.out.println("min:"+y);
        }
    }
    public void min(float x, float y) {
        if(x < y ) {
            System.out.println("min:"+x);
        }else {
            System.out.println("min:"+y);
        }
    }


    //可变参数函数:有多个参数，可变参数一定放到参数列表的最后
    public void sum(int ...n) {
        int sum = 0;
        for(int i: n) {
            sum += i;
        }
        System.out.println("sum:"+sum);
    }

    public boolean search(int item, int ...n) {
        for(int i: n) {
            if(i == item) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        //new一个对象
        FunctDemo fu = new FunctDemo();

        fu.println();
        System.out.println("欢迎使用java方法");
        fu.println();

        System.out.println("面积："+fu.area());
        fu.max(20, 50);
        System.out.println("阶乘："+fu.fac(5));

        int[] arr = {1,100,32,5};
        int[] arr1 = fu.sort(arr);
        fu.printArray(arr1);
        boolean flag = fu.findItem(100, arr);
        if(flag) {
            System.out.println("找到了");
        }else {
            System.out.println("没找到");
        }

        //重载
        fu.min(1,5);
        fu.min(1.2f, 1.5f);

        //可变参数函数
        fu.sum(10,12,1,2,12,4);
        System.out.println(fu.search(10,12,1,2,12,4,10));

        //可变参数是可以传递数组的
        fu.search(1, arr);
    }
}
