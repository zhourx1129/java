public class 乘法表 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        for (i=1;i<10;i++){
            for (j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.print("\n");
        }
    }
}
