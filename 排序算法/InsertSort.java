/**
 * 插入排序
 *
 * 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
 * （如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = { 22, 34, 3, 32, 82, 55, 89, 50, 37, 5, 64, 35, 9, 70 };
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            int index = i-1;
             while (index>=0 && arr[index] > temp){
                 arr[index+1] = arr[index];
                 index--;
            }
            arr[index+1] = temp;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+"\t");
            }
            System.out.println();
        }
    }
}
