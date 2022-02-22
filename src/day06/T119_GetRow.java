package day06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author halley
 * @version 1.0
 * @description: 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * @date 2021/12/12 2:46 下午
 */
public class T119_GetRow {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> curRow = new ArrayList<>();
        // 每一行开头是 1
        curRow.add(1);
        // base case
        if (rowIndex == 0) return curRow;

        // 递归计算出上一行
        List<Integer> preRow = getRow(rowIndex - 1);
        for (int i = 0; i < preRow.size() - 1; i++) {
            // 这一行每个元素等于上一行的两个相邻元素之和
            curRow.add(preRow.get(i) + preRow.get(i + 1));
        }
        // 每一行结尾是 1
        curRow.add(1);
        return curRow;
    }
    @Test
    public void test_119(){
        System.out.println(getRow(3));
    }
}
