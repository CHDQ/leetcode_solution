package problem2;


import org.junit.Test;

public class SolutionTest {
    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode next = new Solution().addTwoNumbers(l1, l2);
        while (next != null) {
            System.out.println(next.val);
            next = next.next;
        }
    }
}