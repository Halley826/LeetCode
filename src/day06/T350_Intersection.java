package day06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author halley
 * @version 1.0
 * @description: 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 *
 * @date 2021/12/12 11:44 上午
 */
public class T350_Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            if (list1.contains(num)) {
                list2.add(num);
                // 从 list1 除去已匹配的数值
                list1.remove(Integer.valueOf(num));//第一次出现o对象的索引位置
                System.out.println(num);
                System.out.println(Integer.valueOf(num));
            }
        }
        int[] res = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            res[i++] = num;
        }
        return res;
    }
    @Test
    public void test_350(){
        intersect(new int[]{1,2,3},new int[]{3,4,2});
    }
}
