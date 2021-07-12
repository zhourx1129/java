import java.util.Scanner;

class Solution {
    public int search(int[] nums, int target) {
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
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要查找的数");
        int target = scan.nextInt();
        Solution solution = new Solution();
        int result = solution.search(nums, target);
        System.out.println(result);
    }
}