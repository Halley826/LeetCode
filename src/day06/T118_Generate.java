package day06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author halley
 * @version 1.0
 * @description: T给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * @date 2021/12/13 2:42 下午
 */
public class T118_Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }
    @Test
    public void test_118(){
        System.out.println(generate(4));
    }
}
