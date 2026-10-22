
class Solution {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {
        // Step 1: Reverse the linked list
        head = reverse(head);

        // Step 2: Double each digit and handle carry
        ListNode curr = head;
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        int carry = 0;

        while (curr != null) {
            int sum = curr.val * 2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            curr = curr.next;
        }

        // Step 3: Add remaining carry
        if (carry != 0) {
            tail.next = new ListNode(carry);
        }

        // Step 4: Reverse the result
        return reverse(dummy.next);
    }
}
