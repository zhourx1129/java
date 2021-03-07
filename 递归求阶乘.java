import java.util.Scanner;

public class 递归求阶乘 {
    public static int fac(int num){
        if (num == 1 || num == 0){
            return 1;
        }else{
            return num * fac(num-1);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数:>");
        int num = scan.nextInt();
        System.out.println(fac(num));
    }
}
