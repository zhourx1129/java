public class 数组插入元素 {
    public static void main(String[] args) {
        // 一开始的默认数组
        int[] arr = {10,20,30,40,55};
        int index1 = arr.length;
        // 要添加的数
        int insertNum = 25;

        for (int i = 0; i < arr.length; i++) {
//            遇到第一个大于要插入的数，便把此数的坐标留给要插入的数
            if (arr[i] >= insertNum) {
                index1 = i;
                break;
            }
        }
        // 创建一个新数组
        int[] arrNew = new int[arr.length+1];
        for (int i = 0,j=0; i < arrNew.length; i++) {
//            如果 是之前预留位置的下标 则跳过此坐标
            if (i != index1) {
                arrNew[i] = arr[j];
                j++;
            }else {
                arrNew[i] = insertNum;
            }
        }
        arr = arrNew;
//        第一种打印方式
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"\t");
//        }
        for (int i:arr) {
            System.out.print(i+"\t");
        }
    }
}
