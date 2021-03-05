import java.util.Scanner;
public class 最小公倍数与最大公约数 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个数:>");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int pro = num1 * num2;
        int temp = 0;
        while(num2!=0){
            temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("最大公约数是:"+num1);
        System.out.println("最小公倍数是:"+pro/num1);
    }
}
