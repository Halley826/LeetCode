package Test;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author halley
 * @version 1.0
 * @description: 测试HashMap
 * @date 2021/12/14 3:11 下午
 */
public class HashMapTest {
    public void hashmap(){
        HashMap<Character,Integer> index=new HashMap<>();
        String str="hello";

        for(int i=0;i<str.length();i++){
            index.put(str.charAt(i),i);
        }
        index.put('a',1);
        System.out.println(index.toString());
    }
    @Test
    public void test(){
        hashmap();
    }
}
