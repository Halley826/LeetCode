package day02;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * @date 2021/12/8 5:06 下午
 */
public class T997_SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] arr=new int[nums.length];
        int temp=nums.length-1;
        while(left<=right){
            if(nums[left]*nums[left]<nums[right]*nums[right]){
                arr[temp--]=nums[right]*nums[right];
                right-=1;
            }else{
                arr[temp--]=nums[left]*nums[left];
                left+=1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        T997_SortedSquares t997SortedSquares =new T997_SortedSquares();
        t997SortedSquares.sortedSquares(new int[]{-7,-3,2,3,11});
    }

    @Test
    public void test1(){
        sortedSquares(new int[] {-7,-3,2,3-11});
    }
}
