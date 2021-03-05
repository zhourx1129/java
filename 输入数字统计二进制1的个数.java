import java.util.Scanner;

public class 输入数字统计二进制1的个数 {
    public static void main(String[] args) {
        // 第一种方法   & 1
        // Scanner scan = new Scanner(System.in);
        // System.out.println("请输入一个十进制数字:>");
        // int num = scan.nextInt();
        // int count = 0;
        // while(num != 0){
        //     if((num & 1) == 1){
        //         count ++;
        //     }
        //     num /= 2;
        // }
        // System.out.println(count);
        // 第二种方法 & (n-1)
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个十进制数字:>");
        int num = scan.nextInt();
        int count = 0;
        while(num != 0){
            num = num & (num-1);
            count++;
        }
        System.out.println(count);
    }
}
