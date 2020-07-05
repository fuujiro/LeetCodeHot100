import java.util.HashSet;

public class T141 {

    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //哈希表 速度较慢
    public class Solution {
        public boolean hasCycle(ListNode head) {
            HashSet<ListNode> hs = new HashSet<>();
            while (head != null) {
                if (hs.contains(head)) {
                    return true;
                } else {
                    hs.add(head);
                    head = head.next;
                }
            }
            return false;
        }
    }

    //快慢指针 速度较快
    public class Solution2 {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            ListNode fast = head.next;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                if (fast == slow)
                    return true;
                fast = fast.next.next;
                slow = slow.next;
            }
            return false;
        }
    }
}
