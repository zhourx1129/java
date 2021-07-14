/**
 * 快速排序
 *
 * 从数列中挑出一个元素，称为 "基准"（pivot）;
 * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 * 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
 * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序；
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 22, 34, 3, 32, 82, 55,64, 89, 50, 37, 5, 35, 9, 70 };
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    // 递归
    private static void quickSort(int[] arr, int left, int right) {
        if(left<right){
            int mid = recursive(arr, left, right);
            quickSort(arr, left, mid-1);
            quickSort(arr, mid+1, right);
        }
    }

    private static int recursive(int[] arr, int left, int right) {
        int tmp = arr[left];
        while (left < right){
            while (left<right && arr[right] >= tmp){
                right--;
            }
            arr[left] = arr[right];
            while (left<right && arr[left] <= tmp){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[right] = tmp;
        return left;
    }
}
