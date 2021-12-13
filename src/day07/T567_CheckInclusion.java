package day07;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author halley
 * @version 1.0
 * @description: TODO
 * @date 2021/12/13 11:19 上午
 */
public class T567_CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            need.put(s1.charAt(i), need.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;
            // 进行窗口内数据的一系列更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c,0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            // 判断左侧窗口是否要收缩,因为是包含 s1 排列的子串，所以长度一定和 s1 长度一样，超了就说明不满足得收缩窗口
            while (right - left >= s1.length()) {
                // 在这里判断是否找到了合法的子串
                if (valid == need.size()) {
                    return true;
                }
                char d = s2.charAt(left);
                left++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))){
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        // 未找到符合条件的子串
        return false;
    }
    @Test
    public void test567(){
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
}
