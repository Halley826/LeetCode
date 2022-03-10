package day04;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 * @date 2021/12/10 10:45 上午
 */
public class T70_ClimbStairs {
    public int climbStairs(int n) {//第n个台阶只能从第n-1或者n-2个上来。到第n-1个台阶的走法 + 第n-2个台阶的走法 = 到第n个台阶的走法，已经知道了第1个和第2个台阶的走法，一路加上去。
        if(n==1||n==2) return n;
        int pre=1;
        int cur=2;
        for(int i=2;i<n;i++){
            int sum=pre+cur;
            pre=cur;
            cur=sum;
        }
        return cur;
    }
    @Test
    public void test_70(){
        System.out.println(climbStairs(3));
    }
}
