import java.util.Scanner;
/**
 * 快速排序
 */
public class 快速排序 {

    public static int sort(int[] arr,int left,int right) {
        int temp = arr[left];
        while (left<right) {
            while (left<right && arr[right] >= temp) {
                right --;
            }
            arr[left] = arr[right];
            while (left<right && arr[left] <= temp) {
                left ++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;
        return left;
    }
    public static void quickSort(int[] arr,int left,int right) {
        if (left<right) {
            int mid = sort(arr,left,right);
            quickSort(arr, left, mid-1);
            quickSort(arr, mid+1, right);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int [n];
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        quickSort(arr,0,n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}