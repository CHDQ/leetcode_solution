package problem2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode c = result;
        ListNode c1 = l1;
        ListNode c2 = l2;
        int carry = 0;
        while (c1 != null || c2 != null || carry != 0) {
            c.next = new ListNode(0);
            c = c.next;
            int sum = carry;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            carry = sum / 10;
            if (carry == 1) {
                sum -= 10;
            }
            c.val = sum;
        }
        result = result.next;
        return result;
    }
}
