import java.util.*;

// 默认密码是 zhourx1129
public class 模拟登陆 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 3;
        while(count != 0){
            System.out.println("请输入您的密码:");
            String password = scan.nextLine();
            if(password.equals("zhourx1129")){
                System.out.println("密码正确,登录成功!");
                break;
            }else{
                count --;
                if(count == 0){
                    System.out.println("密码错误,您的账户已被锁定");
                }else{
                    System.out.println("密码错误,您还有"+count+"次机会尝试登录");
                }
            }
        }
    }
}
