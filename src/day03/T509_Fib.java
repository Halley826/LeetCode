package day03;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 * @date 2021/12/9 5:01 下午
 */
public class T509_Fib {
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
