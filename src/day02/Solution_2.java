package day02;

/**
 * @author halley
 * @version 1.0
 * @description: TODO
 * @date 2021/12/8 11:12 上午
 */
public class Solution_2 {
    public int[] searchRange(int[] nums, int target) {
        int mid;
        int left_bound,right_bound;
        int left_temp=0,right_temp=nums.length;
        if(nums[0]==target) left_bound=0;
        else {
            while((left_temp+1)!=right_temp){        //寻找左边界
                mid=left_temp+(right_temp-left_temp)/2;
                if(nums[mid]<target) left_temp=mid;
                else right_temp=mid;
            }
            left_bound=right_temp;
        }
        left_temp=0;
        right_temp=nums.length;
        while((left_temp+1)!=right_temp){//寻找右边的边界
            mid=left_temp+(right_temp-left_temp)/2;
            if(nums[mid]<=target) left_temp=mid;
            else right_temp=mid;
        }
        right_bound=left_temp;
        if(left_bound>right_bound) return new int[]{-1,-1};
        if (nums[left_bound]!=target) return new int[]{-1,-1};
        return new int[]{left_bound,right_bound};
    }

    public static void main(String[] args) {
        Solution_2 solution_2=new Solution_2();
        int[] arr=new int[]{};
        arr=solution_2.searchRange(new int[] {1},0);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
