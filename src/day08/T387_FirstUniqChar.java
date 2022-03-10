package day08;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author halley
 * @version 1.0
 * @description: 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * @date 2021/12/14 9:40 上午
 */
public class T387_FirstUniqChar {

    public int firstUniqChar(String s) {//暴力破解
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)&&i!=j){
                    arr[i]=1;
                    break;
                }
            }

        }
        for(int k=0;k<arr.length;k++){
            if (arr[k]==0){
                return k;
            }
        }
        return -1;
    }//暴力破解
    public int firstUniqChar_1(String s){
        int[] arr=new int[s.length()];
        HashMap<Character,Integer> index=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if (index.containsKey(s.charAt(i))){
                index.put(s.charAt(i),Integer.MAX_VALUE);
            }else {
                index.put(s.charAt(i),i);
            }
        }
        Iterator iterator=index.values().iterator();
        int res=Integer.MAX_VALUE;
        while (iterator.hasNext()){
            int value= (int)iterator.next();
            //System.out.print(value+" ");
            res=Math.min(res,(int)value);

        }
        if(res!=Integer.MIN_VALUE) return res;
        return -1;}//HashMap
    @Test
    public void test_387(){
        //System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar_1("loveleetcode"));
    }
}
