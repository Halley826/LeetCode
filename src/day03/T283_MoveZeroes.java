package day03;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @date 2021/12/9 9:23 上午
 */
public class T283_MoveZeroes {

    char leftOf(char c) {
        if (c == '}') return '{';
        if (c == ')') return '(';
        return '[';
    }
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
