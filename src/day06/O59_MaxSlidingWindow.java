package day06;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 * @date 2021/12/12 3:44 下午
 */
public class O59_MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums,int k){
        int[] max_arr=new int[nums.length-k+1];
        for(int i=0;i< nums.length+1-k;i++){
            max_arr[i]=nums[i];
            for (int j=i+1;j<i+k;j++){
                if(max_arr[i]<nums[j])
                max_arr[i]=nums[j];
            }
        }
        return  max_arr;
    }
    @Test
    public void test_59(){
        maxSlidingWindow(new int[]{1,2,3,4,2,1},3);
    }
}
