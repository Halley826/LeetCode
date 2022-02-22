package day05;

import org.junit.Test;

import java.util.List;

/**
 * @author halley
 * @version 1.0
 * @description:给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 * @date 2021/12/11 9:26 上午
 */

public class T876_MiddleNode {
    public ListNode middleNode(ListNode head) {//使用快慢指针解题
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow);
        return slow;
    }
    public ListNode middleNode_1(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        // int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr);
        T876_MiddleNode solution = new T876_MiddleNode();
        ListNode res = solution.middleNode_1(head);
        System.out.println(res.val);
    }

}
