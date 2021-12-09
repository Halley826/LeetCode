package day03;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: TODO
 * @date 2021/12/9 9:23 上午
 */
public class Solution_1 {
    public void moveZeroes(int[] nums) {//快慢指针，双指针
        int slow=0;
        int fast=0;
        int sum=0;
        while(fast< nums.length){
            if(nums[fast]!=0){//首先移动
                nums[slow]=nums[fast];
                slow+=1;
                sum+=1;
            }
            fast+=1;
        }
//        for(int i=nums.length-1;i>nums.length-sum;i--){//从后面赋值为0
//            nums[i]=0;

    }
    @Test
    public void test_1(){
        moveZeroes(new int[]{1,1});
    }
}
