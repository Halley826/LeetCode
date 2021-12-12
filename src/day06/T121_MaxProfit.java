package day06;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * @date 2021/12/12 12:37 下午
 */
public class T121_MaxProfit {
    public int maxProfit(int[] prices) {//暴力破解 ，时间超出
        int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                max=Math.max(max,prices[j]-prices[i]);
            }
        }
        return max;
    }

    /**
     * @description: 暴力破解存在很多重复计算，因此考虑动态规划。
     * @author
     * @date
     * @version 1.0
     */

    public int maxProfit_1(int[] prices){
        if (prices.length<=1) return 0;
        int min=prices[0],max=0;
        for(int i=1;i<prices.length;i++){
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return max;
    }

    @Test
    public void test_121(){
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 1, 2, 3}));
        System.out.println(maxProfit_1(new int[]{1, 2, 3, 4, 1,2,3}));
    }
}

