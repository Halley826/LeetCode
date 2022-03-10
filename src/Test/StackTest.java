package Test;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @author halley
 * @version 1.0
 * @description: Stack测试
 * @date 2022/3/9 4:42 PM
 */
public class StackTest {
    //使用LinkedList模拟Stack
    LinkedList<Integer> stack;
    LinkedList<Integer> minStack;
    public void MinStack(){
        stack=new LinkedList<>();
        minStack=new LinkedList<>();//记录最小元素的位置
    }
    public void push(int x){//像最顶部插入元素x
        stack.addLast(x);
        if(minStack.size()>0&&minStack.getLast()<=x){
            minStack.addLast(minStack.getLast());
        }else {
            minStack.addLast(x);
        }
    }
    public void pop(){//删除最顶部元素
        minStack.removeLast();
        stack.removeLast();
    }
    public int top(){//返回最顶部元素
        return minStack.getLast();
    }
    public int min(){
        //获取最小的元素
        return minStack.getLast();
    }
    @Test
    public void test(){
        MinStack();
        push(1);
        push(2);
        push(9);
        System.out.println("min:"+min());;
    }
}
