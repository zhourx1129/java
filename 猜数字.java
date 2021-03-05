import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(100)+1; //1~100
        while(true){
            System.out.println("请输入猜测数字>:");    
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if(num < randNum){
                System.out.println("小了");
            }else if(num > randNum){
                System.out.println("大了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
        
    }
}
