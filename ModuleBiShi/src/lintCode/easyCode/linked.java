package lintCode.easyCode;

import java.util.ArrayList;
import java.util.List;

public class linked {
    /**
     * 在链表中找值为 value 的节点，如果没有的话，返回空(null)。
     *
     * @param head:the head of linked list.
     * @param val:An   integer.
     * @return: a linked node or null.
     */
    public ListNode findNode(ListNode head, int val) {
        while (head != null) {
            if (head.val == val) {
                return head;
            } else {
                head = head.next;
            }
        }
        return null;
    }

    /**
     * 找链表的中点。
     *
     * @param head: the head of linked list.
     * @return: a middle node of the linked list
     */
    // 快慢指针，快指针每次走两步，慢指针每次走一步，快指针走到end时候，慢指针指向middle
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 找链表的中点
     *
     * @param head: the head of linked list.
     * @return: a middle node of the linked list
     */
    public ListNode middleNode2(ListNode head) {
        ListNode tester = head;
        int count = 0;

        while (tester != null) {
            tester = tester.next;
            count++;
        }

        int i = 0;
        if (count % 2 == 0) {
            count--;
        }
        while (i < count / 2) {
            head = head.next;
            i++;
        }
        return head;
    }

    /**
     * 链表转数组
     * @param head
     * @return
     */
    public List<Integer> toArrayList(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        //遍历链表，并将ListNode的val存储在数组中
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }

    /**
     *将1~n的数依次加入数组中
     * @param size
     * @return
     */
    public List<Integer> generate(int size){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }
        return list;
    }
}
