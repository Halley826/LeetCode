package day10;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: TODO
 * @date 2022/3/11 10:02 AM
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int temp=1;
        for(int i = digits.length-1;i>=0;i--){
            int tmp=digits[i];

            digits[i]=(digits[i]+temp)%10;
            temp=(tmp+temp)/10;//最新的标志位
            //System.out.println(temp);
            //System.out.println(digits[i]);
            //System.out.println(temp);
        }
        //System.out.println(temp);
        if(temp==1){
            int[] arr=new int[digits.length+1];
            arr[0]=temp;
            for (int i=0;i< digits.length;i++){
                arr[i+1]=digits[i];
            }
            return arr;
        }
        return digits;
    }


    @Test
    public void test(){
        int [] arr=plusOne(new int[]{1,2,3});
        for(int i:arr){
            System.out.println(i);
        }
    }
}
