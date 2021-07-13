/**
 * 选择排序
 *
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 重复第二步，直到所有元素均排序完毕。
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 22, 34, 3, 32, 82, 55, 89, 50, 37, 5, 64, 35, 9, 70 };
        for (int i = 0; i < arr.length-1; i++) {
            //        初始化一个最小值，把这趟要找到最小数的下标作为最小值
            int minIndex = i;
//            由于这趟的下标最为最小值了，所以可以从下位数开始
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
//            求出最小值的下标
            if (minIndex != i) {
//                最小值的下标不是原来的了，说明最小值改变了，交换他们的值
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i]= temp;
            }
/*            for (int h = 0; h < arr.length; h++) {
                System.out.print(arr[h]+"\t");
            }
            System.out.println();*/
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
