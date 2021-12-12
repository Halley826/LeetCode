package day03;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: TODO
 * @date 2021/12/9 5:01 下午
 */
public class Solution_3 {
    public int fib(int n) {
        int pre=0;
        int cur=1;
        for(int i=0;i<n;i++){
            int sum=pre+cur;
            pre=cur;
            cur=sum;
        }
        return cur;
    }
    @Test
    public void test_3(){
        System.out.println(fib(3));
    }
}
