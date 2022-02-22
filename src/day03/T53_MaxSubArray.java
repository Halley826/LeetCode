package day03;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: TODO
 * @date 2021/12/9 3:39 下午
 */
public class T53_MaxSubArray {
    int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int[] dp = new int[n];
        // base case
        // 第一个元素前面没有子数组
        dp[0] = nums[0];
        // 状态转移方程
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }
        // 得到 nums 的最大子数组
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
    @Test
    public void test_1(){
        maxSubArray(new int[]{-1,-2,10,-3,-5,-1,1});
    }
}
