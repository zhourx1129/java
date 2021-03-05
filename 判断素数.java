import java.util.Scanner;;
public class 判断素数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 2;
        for(i=2;i<num;i++){
            if(num % i == 0){
                break;
            }
        }
        if(i == num){
            System.out.println(num+"是素数");
        }else{
            System.out.println(num+"不是素数");
        }
    }
}
