import java.util.Scanner;

/**
 * hannuoTower
 */
public class hannuoTower {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Tower tower = new Tower();
        tower.move(num, 'A', 'B', 'C');
    }
}
/**
 * num  有多少盘子
 * a    第一个柱子
 * b    中间的柱子
 * c    最终要移动到的柱子
 */
class Tower {
    public  void move(int num, char a,char b,char c) {
        // 如果只有一个盘子 可以直接从a移动到b
        if (num == 1) {
            System.out.print(a+"->"+c+"\t");
        } else {
        // 如果有多个盘子 可以理解为 两个盘子：最下面的盘子 和 上面所有的盘子
        // 把上面的盘子移动到 b柱子。
            move(num-1, a, c, b);
        //然后把 最后一个盘子移动到 c柱子
            System.out.print(a+"->"+c+"\t");
        // 然后把b柱子上的所有盘子移动到c
            move(num-1, b, a, c);
        }
    }
}