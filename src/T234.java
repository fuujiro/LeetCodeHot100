import java.util.ArrayList;
import java.util.List;

public class T234 {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            List<Integer> vals = new ArrayList<>();
            while (head != null) {
                vals.add(head.val);
                head=head.next;
            }
            int l = 0, r = vals.size()-1;
            while (l < r) {
                if(!vals.get(l).equals(vals.get(r)))
                    return false;
                l++;
                r--;
            }
            return true;
        }
    }
}
