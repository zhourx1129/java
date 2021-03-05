public class 打印1到100所有的素数 {
    public static void main(String[] args){
        int i = 1;
        for (i=1;i<=100;i++){
            int j = 2;
            for (j=2;j<=(int)(Math.sqrt(i));j++){
                if(i%j==0){
                    break;
                }
            }
            if(j>=(int)Math.sqrt(i)){
                System.out.println(i+"是素数");
            }
        }
    }
}
