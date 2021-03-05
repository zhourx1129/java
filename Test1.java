import java.util.Scanner;
/**
 *不能做switch参数的类型有 long float double boolean
 */
// public class Test1 {
//     public static void main(String[] args){
// 		Scanner scan = new Scanner(System.in);
		// int a = scan.nextInt();
		// switch (a){
		// 	case 1:
		// 		System.out.println("1");
		// 		break;
		// 	case 2:
		// 		System.out.println("2");
		// 		break;
		// 	default:
		// 		System.out.println("请按要求输入");
		// 		break;
		// }
//     }
// }

/* public class Test1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要判断的年龄");
		int age = scan.nextInt();
		if(age <= 18){
			System.out.println("少年");
		}else if(age <= 28){
			System.out.println("青年");
		}else if(age <= 55){
			System.out.println("中年");
		}else{
			System.out.println("老年");
		}
	}
} */

// 1/1-1/2+1/3-1/4+1/5-1/6...-1/100
public class Test1{
	public static void main(String[] args){
		double sum = 0;
		int i = 1;
		int flag = 1;
		for (i=1;i<=100;i++){
			sum += flag * 1.0/i;
			flag *= -1;
		}
		System.out.println("sum= "+sum);
	}
}

