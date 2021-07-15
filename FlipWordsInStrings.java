/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */
class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        // 初始化单词首地址
        int start = 0;
        for (int i = 0;i<arr.length;i++){
            // 最后的单词没有空格
            if(i==arr.length-1){
                myReverse(arr,start,i);
            }else if(arr[i] == ' '){   // 遇到空格了说明一个单词结束了
                myReverse(arr,start,i-1);
                start = i+1;  // start 变成下一个单词的首地址
            }
        }
        return new String(arr);
    }
    public void myReverse(char[] arr,int i,int j){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
public class FlipWordsInStrings {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        Solution solution = new Solution();
        str = solution.reverseWords(str);
        System.out.println(str);
    }
}
