/**
 * 希尔排序
 *
 * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
 * 待整个序列中的记录"基本有序"时，再对全体记录进行依次直接插入排序。
 *
 * 就是对插入排序进行分组
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = { 22, 34, 3, 32, 82, 55, 89, 50, 37, 5, 64, 35, 9, 70 };
//        先分两组，每组元素为 长度/2
        int len = arr.length;
        for (int gap = len/2; gap > 0 ; gap/=2) {
//            分好组了，开始使用插入排序
            for (int i = gap; i < len; i++) {
                int temp = arr[i];
                int index = i-gap;
                while (index >=0 && arr[index] >temp){
                    arr[index+gap] = arr[index];
                    index -= gap;
                }
                arr[index+gap] = temp;
            }
            for (int j = 0; j < len; j++) {
                System.out.print(arr[j]+"\t");
            }
            System.out.println();
        }
    }
}
