// 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

class Solution {
    public int[] sortedSquares(int[] nums) {
        // 先平方
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        // 开始排序 使用简单的冒泡排序
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}

/**
 * 有序数组的平方
 */
public class 有序数组的平方 {
    public static void main(String[] args) {
        int[] nums = { -7, -3, 2, 3, 11 };
        Solution solution = new Solution();
        int[] arr = solution.sortedSquares(nums);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

}