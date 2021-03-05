// public class Test{
// 	public static void main(String[] args){
// 		System.out.println("你好世界");
// 		System.out.println("你好世界");
// 	}
// }

// public	class Test{
// 	public static void main(String[] args){
// 		int a=8;
// 		System.out.println("a="+a);
// 	}
// }

// public class Test{
// 	public static void main(String[] args){
// 		// double d = 12.5;
// 		double a = 1;
// 		int b = 2;
// 		System.out.println(a/b);
// 	}
// }

// public class Test{
// 	public static void main(String[] args){
// 		float f = 12.3F;
// 		System.out.println(f);
		
// 		char ch = 'a'; //字符型占两个字节
// 		System.out.println(ch);
// 		char ch1 = '周';  //因为是两个字节 所以可以是汉字
// 		System.out.println(ch1);

// 		char ch2 = 98;
// 		System.out.println(ch2);

// 		boolean flg = false;//布尔类型没有明确的大小
// 		System.out.println(flg);// 真只有true 假只有false 没有 1和 0
// 	}
// }

// public class Test{
// 	public static void main(String[] args){
// 		String str = "hellow";
// 		System.out.println(str);
// 		String str1 = "\"hellow\"";
// 		System.out.println(str1);
// 	}
// }


// public class Test{
// 	public static void main(String[] args) {
// 		int maxNum = 5;  // 变量建议使用小驼峰
// 		final int MAX = 19; // final 修饰变量变为 常量  并且常量建议使用大写
// 		// MAX = 20; // 报错  常量不能更改
// 		System.out.println(maxNum);
// 		System.out.println(MAX);
// 	}
// }

// public class Test{
// 	public static void main(String[] arge){
		// System.out.println(5/2); // 2
		// System.out.println(5.0/2); // 2.5
		// System.out.println((float)(5/2)); // 2.0
		// System.out.println((float)5/2); // 2.5

		// System.out.println(10%3); // 1
		// System.out.println(-10%3);// -1
		// System.out.println(10%-3); // 1
		// System.out.println(-10%-3); // -1

		// System.out.println(11%3); // 2
		// System.out.println(-11%3);// -2
		// System.out.println(11%-3); // 2
		// System.out.println(-11%-3); // -2

		// int i = 10;
		// // i = i ++;
		// // System.out.println(i); // 10 与C语言不同 C语言是 11
		// i = (i+=2);
		// System.out.println(i); // 12

		// int a = 10;
		// int b = 20;
		// System.out.println(!(a<b)); // false
		// System.out.println(a<b); //true

// 	}
// }

import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// 输入整型数字  
		// int a = scan.nextInt();
		// 如果是小数可以使用 nextFloat 或者 nextDouble
		// System.out.println(a);
		
		String str = scan.nextLine();
		System.out.println(str);
	}
}
















