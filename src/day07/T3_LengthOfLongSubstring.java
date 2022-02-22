package day07;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author halley
 * @version 1.0
 * @description: 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * @date 2021/12/13 9:39 上午
 */
public class T3_LengthOfLongSubstring {

    /**
     * map (k, v)，其中 key 值为字符，value 值为字符位置;
     *
     *
     * 怎样判断是否遇到重复字符，且怎么知道上一个重复字符的位置？--用哈希字典的key来判断是否重复，用value来记录该字符的下一个不重复的位置。
     */
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < length; end++){//start不动，end向后移动
            char element = s.charAt(end);
            if(map.containsKey(element)){
                start = Math.max(map.get(element) + 1, start); //当end遇到重复字符，start应该放在上一个重复字符的位置的后一位，同时记录最长的长度
            }
            max = Math.max(max, end - start + 1);
            map.put(element, end);
        }
        return max;
    }


    public int lengthOfLongestSubstring_1(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            System.out.println("i="+i);
            System.out.println(map);
            if(map.containsKey(s.charAt(i))){
                left = map.get(s.charAt(i)) + 1;
            }
            System.out.println("s.charAt:"+s.charAt(i));
            System.out.print("left="+left+"\n");
            map.put(s.charAt(i),i);
            System.out.println("i-left+1:"+(i - left + 1));
            // max = Math.max(max,i-left+1);
            System.out.println("________________");
        }
        return max;
    }

    @Test
    public void test_5(){
        System.out.println(lengthOfLongestSubstring("ababcbbbaabcd"));
    }
}
