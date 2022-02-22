package day08;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author halley
 * @version 1.0
 * @description: 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * @date 2021/12/14 3:24 下午
 */
public class T242_IsAnagram {
    public boolean isAnagram_1(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] arr_t=new int[26];
        int[] arr_s=new int[26];
        for (int i=0;i<s.length();i++){
            arr_s[s.charAt(i)- 'a']++;
        }
        for (int j=0;j<t.length();j++){
            arr_t[t.charAt(j)-'a']++;
        }
        for (int k=0;k<26;k++){
            if(arr_s[k]!=arr_t[k]) return false;
        }
        return true;
    }//override yp

    public boolean isAnagram(String s, String t) {//使用Hashmap
        HashMap<Character,Integer> index_s=new HashMap<>();
        HashMap<Character,Integer> index_t=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (index_s.containsKey(s.charAt(i))){
                index_s.put(s.charAt(i),index_s.get(s.charAt(i))+1);
            } else {
                index_s.put(s.charAt(i),1);
            }
        }
        for(int j=0;j<t.length();j++){
            if (index_t.containsKey(t.charAt(j))){
                index_t.put(t.charAt(j),index_t.get(t.charAt(j))+1);
            } else {
                index_t.put(t.charAt(j),1);
            }
        }

        System.out.println(index_s.toString());
        System.out.println(index_t.toString());
        //if(index_s.size()!=index_t.size()) return false;
        return index_s.equals(index_t);
    }//使用Hashmap
    @Test
    public void test_242(){
        System.out.println(isAnagram_1("aaa", "aaa"));
    }
}
