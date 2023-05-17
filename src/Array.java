import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = {4,100,7,1,12};
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
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] arr1 = new int[5];
        for(int i = 0; i < arr1.length; i++) {
            Scanner in = new Scanner(System.in);
            arr1[i] = in.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("sum:"+sum);


        //求一个数组的最大值
        int[] arr2 = {23, 1, 54, 25, 5, 29};
        int max = arr2[0];
        for(int i = 1; i < arr2.length; i++) {
            if(max < arr2[i]) {
                max = arr2[i];
            }
        }
        System.out.println(max);


        //遍历数组
        System.out.println("遍历数组：");
        for(int n: arr2) {
            System.out.println(n);
        }

        //冒泡排序
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2.length-i-1; j++) {
                if(arr2[j] > arr2[j+1]) {
                    int tmp = arr2[j+1];
                    arr2[j+1] = arr2[j];
                    arr2[j] = tmp;
                }
            }
        }

        System.out.print("排序结果：");
        for(int n: arr2) {
            System.out.print(" "+n);
        }

        //二维数组
        //声明：
        int[][] intArray;

        float floatArray[][];

        double[] doublesArray[];

        intArray =new int[3][3];
        intArray[1][2] = 9;

        //声明同时创建
        char[][] ch = new char[3][3];
        for(char[] n: ch) {
            n = new char[3];
        }

        //创建一个float二维数组
        floatArray = new float[3][];
        floatArray[0] = new float[3];
        floatArray[1] = new float[4];
        floatArray[2] = new float[5];
        for(float[] n: floatArray) {
            for(float m: n) {
                System.out.println(m);
            }
        }
    }

}
