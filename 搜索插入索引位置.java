import java.util.Scanner;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

class Aa {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要查找的数");
        int target = scan.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, target));
    }
}