package day01;

/**
 * @author halley
 * @version 1.0
 * @description: 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * @date 2021/12/7 3:07 下午
 */
class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(target<nums[mid]){
                right=mid-1;
            } else if (target>nums[mid]){
                left=mid+1;
            }else if(target==nums[mid]){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] arr=new int[] {5};
        System.out.println(solution.search(arr, 5));
    }
}
