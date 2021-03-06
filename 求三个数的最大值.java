import java.util.Scanner;

public class 求三个数的最大值 {
    public static int maxNum(int num1,int num2,int num3){
        int max = num1 > num2 ?num1 : num2;
        max = max > num3 ? max : num3;
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入三个数:>");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int ret = maxNum(num1,num2,num3);
        System.out.println("最大值是:"+ret);
    }
}
