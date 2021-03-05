import java.util.Scanner;
public class 计算阶乘{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int num  = scan.nextInt();
		int i = 1;
		int pro = 1;
		int sum = 0;
		for (i=1;i<=num;i++){
			pro *= i;
			sum += pro;
		}
		System.out.println(num+"的阶乘是:"+pro);
		System.out.println(num+"阶乘的总和是:"+sum);
	}
}