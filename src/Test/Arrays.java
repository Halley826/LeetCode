package Test;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: 删除数组重复项
 * @date 2021/12/13 7:56 下午
 */
public class Arrays {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int slow=0;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[fast]!=nums[slow]){
                nums[++slow]=nums[fast];
            }
        }
        return ++slow;
    }
    @Test
    public void test_removeDuplicates(){
        int[] arr=new int[]{1,2,3,4,5,3};
        int res=(removeDuplicates(arr));
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
