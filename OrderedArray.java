import java.util.Scanner;

/**
 * 给定一个已按照 升序排列 的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 */
public class OrderedArray {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        System.out.println("请输入args");
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        Solution solution = new Solution();
        int[] temp = solution.twoSum(numbers,target);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+"\t");
        }
    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int left = 0,right = numbers.length-1; left < right;) {
            if (numbers[left]+numbers[right] == target){
                return new int[]{left + 1, right + 1};
            }else if (numbers[left]+numbers[right] > target){
                right--;
            }else {
                left++;
            }
        }
        return null;
    }
}