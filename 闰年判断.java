import java.util.Scanner;

public class 闰年判断 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int year = scan.nextInt();
       if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
           System.out.println(year+"是闰年");
       }else{
           System.out.println(year+"不是闰年");
       }
    }
}
