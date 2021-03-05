// 从0到999999之间的水仙花数
public class 水仙花数 {
    public static void main(String[] args){
        int i = 1;
        int temp = 1;
        for(i=1;i<999999;i++){
            int count = 0;
            int num = i;
            while(num!=0){
                count ++;
                num /= 10;
            }
            num = i;
            int sum = 0;
            while(num != 0){
                temp = num % 10;
                sum += Math.pow(temp,count);
                num /= 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
