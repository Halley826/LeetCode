package day02;

/**
 * @author halley
 * @version 1.0
 * @description: 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * @date 2021/12/8 11:12 上午
 */
public class T34_SearchRange {
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
        T34_SearchRange t34SearchRange =new T34_SearchRange();
        int[] arr=new int[]{};
        arr= t34SearchRange.searchRange(new int[] {1},0);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
