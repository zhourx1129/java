/**
 * 归并排序
 *
 * 分解（Divide）：将n个元素分成个含n/2个元素的子序列。
 * 解决（Conquer）：用合并排序法对两个子序列递归的排序。
 * 合并（Combine）：合并两个已排序的子序列已得到排序结果。
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 22, 34, 3, 32, 82, 55, 89, 50, 37, 5, 64, 35, 9, 70 };
        int[] tmp = new int[arr.length];    //新建一个临时数组存放
        mergeSort(arr,0,arr.length-1,tmp);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
        // 拆分函数
    public static void mergeSort(int[] arr, int left, int right, int[] tmp) {
        if (left < right){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid, tmp);  // 对左边进行拆分
            mergeSort(arr, mid+1, right, tmp);  // 对右边进行拆分
            merge(arr,left,mid,right,tmp);
        }
    }
        // 合并函数
    public static void merge(int[] arr, int left, int mid, int right, int[] tmp) {
        int index = 0;
        int i=left,j=mid+1;  //对左右两边的首元素做索引
        while (i<=mid && j<=right){
            tmp[index++] = arr[i]<=arr[j] ? arr[i++] : arr[j++]; // 把较小的数放在新数组的前面
        }
        // 如果左右两边还有剩余的，把剩余的也追加到新数组里面
        while (i<=mid){
            tmp[index++] = arr[i++];
        }
        while (j<=right){
            tmp[index++] = arr[j++];
        }
        for (int k = 0; k < index; k++) {
            arr[left+k] = tmp[k];
        }
    }
}
