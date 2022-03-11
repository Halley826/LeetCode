package day09;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author halley
 * @version 1.0
 * @description: 公共最长字串
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * @date 2022/3/10 7:44 PM
 */
public class T14_longestCommonPrefix {
    public String longestCommonPrefix_1(String[] strs) {
        if(strs.length==0) return "";
        Arrays.sort(strs);//排序，最后只需要对比最后两个相同的位数
        char [] arr1=strs[0].toCharArray();
        char [] arr2=strs[strs.length-1].toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr1.length&&i<arr2.length;i++){
            if(arr1[i]!=arr1[i]){
                break;
            }else if (arr1[i]==arr2[i]){
                sb.append(arr1[i]);
            }
        }
        if(sb.toString().length()<=0) return "";
        return sb.toString();
    }
    @Test
    public void test(){
        System.out.println(longestCommonPrefix_1(new String[]{"[\"flower\",\"flow\",\"flight\"]"}));
    }
}
