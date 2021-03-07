import java.util.Scanner;

public class 汉诺塔 {
    //移动函数
    public static void move(char pos1,char pos3){
        System.out.print(pos1+"->"+pos3+"  ");
    }
    /**
     * @param n 盘子个数
     * @param pos1 起始位置
     * @param pos2 中途位置
     * @param pos3 目的地位置
     */
    //中间运算函数
    public static void hannoi(int n,char pos1,char pos2,char pos3) {
        if(n==1){
            move(pos1, pos3);
        }else{
            hannoi(n-1, pos1, pos3, pos2);
            move(pos1, pos3);
            hannoi(n-1, pos2, pos1, pos3);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入盘子个数:>");
        int n = scan.nextInt();
        hannoi(n, 'A', 'B', 'C');
    }
}
