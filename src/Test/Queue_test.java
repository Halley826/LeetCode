package Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author halley
 * @version 1.0
 * @description: Queue测试
 * @date 2021/12/14 8:50 下午
 */
public class Queue_test {//
    public static void main(String[] args) {
        //1.Initialize a queue
        Queue<Integer> q=new LinkedList<>();
        //2.Get the first element-return null if queue is empty.
        System.out.println("the first element:"+q.peek());
        //3.push new element
        q.offer(5);
        System.out.println("the first element:"+q.peek());
        q.offer(2);
        q.offer(0);
        //4.pop a element
        q.poll();
        //5.Get the first element
        System.out.println("the first element:"+q.peek());
        //6.get the size of the queue
        System.out.println("the size of queque:"+q.size());
    }
}
