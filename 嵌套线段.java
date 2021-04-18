import java.util.Scanner;

public class 嵌套线段 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 输入多少组数字
        System.out.println("输入要查询多少组数字");
        int n = scan.nextInt();

        int[] a = new int [n];
        int[] b = new int [n];
        for (int i = 0; i < n; i++) {
            // 输入每组的数字
            a[i] = scan.nextInt();  // 左边的数字    
            b[i] = scan.nextInt();  // 右边的数字
        }
//        按照左边的数字进行降序排序
        for (int i = 0; i < n-1; i++) {
            if (a[i] < a[i+1]) {
                int temp = b[i];
                b[i] = b[i+1];
                b[i+1] = temp;
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
//        查看排序是否真的按照左边的数字降序排序
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i]+"  "+b[i]);
//        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[i]>a[j] && b[i]<b[j]){
                    sum++;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}


/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //TODO
            // 输入多少组数字
            int n = cin.nextInt();

            int[] a = new int [n];
            int[] b = new int [n];
            for (int i = 0; i < n; i++) {
                // 输入每组的数字
                a[i] = cin.nextInt();  // 左边的数字
                b[i] = cin.nextInt();  // 右边的数字
            }
            for (int i = 0; i < n-1; i++) {
                if (a[i] < a[i+1]) {
                    int temp = b[i];
                    b[i] = b[i+1];
                    b[i+1] = temp;
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
//            查看排序后的结果
//            for (int i = 0; i < n; i++) {
//                System.out.print(a[i]+"  "+b[i]+" ");
//            }
            int sum=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(a[i]>a[j] && b[i]<b[j]){
                        sum++;
                        break;
                    }
                }
            }
            System.out.println(sum);
        cin.close();
    }
}
*/


