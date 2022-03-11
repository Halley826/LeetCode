package day09;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: TODO
 * @date 2022/3/10 7:06 PM
 */
public class T13_romanToInt {
    public int romanToInt(String s) {
        s=s.replace("IV","a");
        s=s.replace("IX","b");
        s=s.replace("XL","c");
        s=s.replace("XC","d");
        s=s.replace("CD","e");
        s=s.replace("CM","f");
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += getValue(s.charAt(i));
        }
        return res;
    }

    public int getValue(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            case 'a': return 4;
            case 'b': return 9;
            case 'c': return 40;
            case 'd': return 90;
            case 'e': return 400;
            case 'f': return 900;
        }
        return 0;
    }



    @Test
    public  void  test_1(){
        System.out.println(romanToInt("V"));
    }
}
