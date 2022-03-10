package day08;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author halley
 * @version 1.0
 * @description: 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * @date 2021/12/14 11:08 上午
 */
public class T383_CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {//使用hashmap  k-v
        HashMap<Character,Integer> index=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if (index.containsKey(magazine.charAt(i))) {
                index.put(magazine.charAt(i),1+index.get(magazine.charAt(i)));
            }else {
                index.put(magazine.charAt(i),1);
            }
        }
        for(int j=0;j<ransomNote.length();j++){
            if (index.containsKey(ransomNote.charAt(j))&&(index.get(ransomNote.charAt(j))>=1)){
                index.put(ransomNote.charAt(j),index.get(ransomNote.charAt(j))-1);
            }else return false;
        }
        return true;
    }
    @Test
    public void test_383(){
        System.out.println(canConstruct("aaaa", "bbbaaaa"));
    }
}
