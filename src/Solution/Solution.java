package Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author halley
 * @version 1.0
 * @description:
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 * @date 2021/12/7 10:02 上午
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap <Integer,Integer> index=new HashMap<>();
        for (int i=0;i<n;i++)
            index.put(nums[i],i);
        for (int i=0;i<n;i++){
            int other=target-nums[i];
            if(index.containsKey(other)&&index.get(other)!=i)
                return new int[] {i,index.get(other)};
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] ret=solution.twoSum(new int[]{6, 1, 4,3,9,9}, 4);

        char[] arr1=new char[]{'a','b','c'};
        System.out.println(arr1);
        System.out.println("ret:");
        for(int i=0;i< ret.length;i++){
            System.out.print(ret[i]);
            System.out.print(' ');
        }
    }
}
