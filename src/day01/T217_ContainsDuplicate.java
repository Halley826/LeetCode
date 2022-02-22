package day01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
public class T217_ContainsDuplicate {

    /**
     * @description: 判断是否有重复元素
     * @author halley
     * @date
     * @version 1.0
     */
    public boolean containsDuplicate_1(int[] nums) {
        HashMap <Integer,Integer> index=new HashMap<>();//HashMap
        for (int num : nums) {
            index.put(num,0);
        }
        return index.size()!= nums.length;
    }

    public boolean containsDuplicate_2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }


    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap <Integer,Integer> index=new HashMap<>();
        for (int i=0;i<n;i++)
            index.put(nums[i],i);
        for (int i=0;i<n;i++){
            int other=target-nums[i];
            if(index.containsKey(other)&&index.get(other)!=i)
            {
                System.out.println(other);
                System.out.println(index.get(other));
                return new int[] {i,index.get(other)};
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        T217_ContainsDuplicate t217ContainsDuplicate =new T217_ContainsDuplicate();
        int[] ret= t217ContainsDuplicate.twoSum(new int[]{6,1,1,1,1,4,2,2,9,9}, 4);
        char[] arr1=new char[]{'a','b','c'};
        System.out.println(arr1);
        System.out.println("ret:");
        for(int i=0;i< ret.length;i++){
            System.out.print(ret[i]);
            System.out.print(' ');
        }
    }
}
