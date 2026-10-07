/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
      if(head == null || head.next == null || k == 0 ){
        return head;
      }

       // Step1 : find the length of linked list
        int n = 1;
        ListNode tail = head;
        while(tail.next != null){
         tail = tail.next;
         n++;

        }

        // Step 2 : reduce the k
        k = k % n;
        if(k == 0){
            return head;
        }

        //Step3: join a linked list in circuler
        tail.next = head;

        //step4: find newtail
        int step = n - k;
        ListNode newtail = head;
        for(int i =1 ; i<step; i++){
            newtail = newtail.next;
        }

        //step5: break
        ListNode newhead = newtail.next;

        newtail.next = null;

         return newhead;
    }
}