import java.util.Scanner;

public class 男左女右 {
    public static void sort(String[] sex,double[] height){
        for (int j = 0; j < sex.length; j++) {
            for (int i = 1; i < sex.length-1; i++) {
                if ("male".equals(sex[i])){ // 男性
                    if (height[i] < height[i-1]) {
                        double temp = height[i];
                        height[i] = height[i-1];
                        height[i-1] = temp;
                    }
                }else { //女性
                    if (height[i+1] > height[i]) {
                        double temp = height[i];
                        height[i] = height[i+1];
                        height[i+1] = temp;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入人数:");
        int n = scan.nextInt();
        String[] sex = new String [n];  //保存性别
        double[] height = new double[n];  // 保存身高
        String input=null;
        for (int i = 0,j = n-1 , k = 0; i < n; i++) {
            input = scan.next();  //输入性别
            // 男人的话 放在左边
            if ("male".equals(input)) {
                sex[k] = input;
                height[k] = scan.nextDouble();  //输入身高
                k++;
            } else { // 女性放在右边
                sex[j] = input;
                height[j] = scan.nextDouble();  //输入身高
                j--;
            }
        }
        // 对男女进行分割 --> 男左女右
        sort(sex,height);
        for (int i = 0; i < n; i++) {
            System.out.print(height[i]+"\t");
        }
    }
}
