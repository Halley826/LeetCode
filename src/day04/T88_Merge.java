package day04;

/**
 * @author halley
 * @version 1.0
 * @description: 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * @date 2021/12/10 9:54 上午
 */
public class T88_Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m+n];
        int left_1=m-1;
        int left_2=n-1;
        int temp=m+n-1;
        while(left_1>=0&&left_2>=0){
            if(nums1[left_1]>nums2[left_2]) {
                nums1[temp]=nums1[left_1];
                temp-=1;
                left_1-=1;
            } else {
                nums1[temp]=nums2[left_2];
                temp-=1;
                left_2-=1;
            }
        }
        while(left_1>=0){
            nums1[temp]=nums1[left_1];
            temp-=1;
            left_1-=1;
        }
        while(left_2>=0){
            nums1[temp]=nums2[left_2];
            left_2-=1;
            temp-=1;
        }
    }
}
