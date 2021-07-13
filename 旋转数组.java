import java.util.Scanner;

// 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}

public class 旋转数组 {
    public static void main(String[] args) {
        int[] nums = { -1, -100, 3, 99 };
        System.out.println("请输入k");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Solution solution = new Solution();
        solution.rotate(nums, k);
        for (int i : nums) {
            System.out.print(i + "\t");
        }
    }
}