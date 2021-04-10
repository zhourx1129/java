import java.util.Arrays;

public class 数组 {
    public static int[] copyArray(int[] array){
        int[] ret = new int[array.length];
        for(int i = 0; i < array.length; i++){
            ret[i] = array[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = copyArray(array);
        System.out.println(Arrays.toString(ret));
    }
}