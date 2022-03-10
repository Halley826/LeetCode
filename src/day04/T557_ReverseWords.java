package day04;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * @date 2021/12/10 9:00 上午
 */
public class T557_ReverseWords {
    public String reverseWords(String s){
        int left=0;
        int right=s.length()-1;
        String[] str=s.split(" ");
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<str.length;i++){
            ans.append(" "+new StringBuffer(str[i]).reverse());
        }
        ans.delete(0,1);
        return ans.toString();
    }

    @Test
    public void test(){
        System.out.println(reverseWords("hello world"));
    }

    class Solution {
        public String reverseWords(String s) {
            char[] array = s.toCharArray();
            int start = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == ' ') {
                    reverse(array, start, i - 1);
                    start = i + 1; // 更新start为下一个单词的左索引
                    continue;
                }
                if (i == array.length - 1) {
                    reverse(array, start, i);
                }
            }
            return new String(array);
        }

        private void reverse(char[] array, int l, int r) {
            while (l < r) {
                char temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l += 1;
                r -= 1;
            }
        }
    }

    public String reverseWords_1(String s) {
        char[] array = s.toCharArray();
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                reverse(array, start, i - 1);
                start = i + 1; // 更新start为下一个单词的左索引
                continue;
            }
            if (i == array.length - 1) {
                reverse(array, start, i);
            }
        }
        return new String(array);
    }

    private void reverse(char[] array, int l, int r) {
        while (l < r) {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l += 1;
            r -= 1;
        }
    }
    @Test
    public void test_1(){
        System.out.println(reverseWords_1("hello world"));
    }

}
