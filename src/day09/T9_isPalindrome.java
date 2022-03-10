package day09;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: 探索回文数的多种解决方法
 * @date 2022/3/10 4:58 PM
 */
public class T9_isPalindrome {
    public boolean isPalindrome_2(int x) {
        //方法二：将其倒过来，观察是否相等
        if (x<0) return false;
        if (x==0) return true;
        int sum=x;
        int cur=0;
        while(sum>0){
            cur=cur*10+sum%10;
            sum=sum/10;
        }
        return cur==x;
    }
    @Test
    public  void  test(){

    }
}
