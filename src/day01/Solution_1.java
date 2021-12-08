package day01;

/**
 * @author halley
 * @version 1.0
 * @description: TODO
 * @date 2021/12/7 5:08 下午
 */
class Solution_1 {
    public int searchInsert(int[] nums, int target) {
        return left_bound(nums, target);
    }

    // 搜索左侧边界的二分算法
    int left_bound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length; // 注意

        while (left < right) { // 注意
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid; // 注意
            }
        }
        return left;
    }


    public static void main(String[] args) {
        Solution_1 solution_1=new Solution_1();
        int[] arr=new int[] {1,3,5,6};
        System.out.println(solution_1.searchInsert(arr, 5));
    }
}

