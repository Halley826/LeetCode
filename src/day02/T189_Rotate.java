package day02;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/rotate-array/
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * @date 2021/12/8 6:46 下午
 */
public class T189_Rotate {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int temp;
        for(int i=0; i<k;i++) res(nums);
    }

    private void res(int[] nums) {
        int temp=nums[0];
        for(int i= nums.length-1;i>0;i--){
            nums[(i+1)% nums.length]=nums[i];
        }
        nums[1]=temp;
    }
    class Solution {
        public void rotate(int[] nums, int k) {
            k=k%nums.length;
            int[] arr=new int[nums.length];
            for(int i=0;i< nums.length;i++){
                arr[(i+k)% nums.length]=nums[i];
            }
            for(int i=0;i< nums.length;i++){
                nums[i]=arr[i];
            }

        }
    }
    @Test
    public void test1(){
        rotate(new int[]{1,2,3,4},13);
    }
}
