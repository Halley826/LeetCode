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



    public boolean isPalindrome_1(int x) {
        if(x<0) return false;
        if(x==0) return true;
        StringBuilder sb=new StringBuilder();
        while(x>0){
            sb.append(x%10);
            x=x/10;
        }
        int left=0,right=sb.length()-1;
        while(left<=right){
            if(sb.charAt(left)!=sb.charAt(right)){
                return false;
            }
            left+=1;
            right-=1;
        }
        return true;
    }

    public boolean isPalindrome_3(int x){
        String s=String.valueOf(x);
        //System.out.println(s);
        char[] arr=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left+=1;
            right-=1;
        }
        return true;
    }

    @Test
    public  void  test_2(){
        System.out.println(isPalindrome_2(19222));
        System.out.println(isPalindrome_2(123321));
    }
    @Test
    public void  test_1(){
        System.out.println(isPalindrome_2(19222));
        System.out.println(isPalindrome_2(123321));
    }
    @Test
    public void test_3(){
        System.out.println(isPalindrome_3(123321));
    }
}
