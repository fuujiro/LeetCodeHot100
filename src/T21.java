public class T21 {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode root = new ListNode(0);
            ListNode head = root;
            while (l1 != null && l2 != null) {
                if (l1.val > l2.val) {
                    head.next = l2;
                    head = head.next;
                    l2 = l2.next;
                } else {
                    head.next = l1;
                    head = head.next;
                    l1 = l1.next;
                }
            }
            if (l1 != null) {
                head.next=l1;
            } else {
                head.next=l2;
            }
            return root.next;
        }
    }
}
