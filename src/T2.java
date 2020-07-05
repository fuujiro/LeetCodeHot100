public class T2 {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int extra = 0;
            ListNode root = new ListNode(0);
            ListNode head = root;
            while (l1 != null || l2 != null) {
                int x = 0, y = 0;
                if (l1 != null ) {
                    x=l1.val;
                    l1=l1.next;
                }
                if (l2!= null){
                    y=l2.val;
                    l2=l2.next;
                }
                int sum = (x+y+extra)%10;
                extra = (x+y+extra)/10;
                head.next=new ListNode(sum);
                head=head.next;
            }
            if (extra != 0) {
                head.next=new ListNode(extra);
                head=head.next;
            }
            return root.next;
        }
    }
}
