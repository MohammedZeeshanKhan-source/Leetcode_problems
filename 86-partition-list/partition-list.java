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
    public ListNode partition(ListNode head, int x) {
        ListNode lesserhead = new ListNode (-1);
        ListNode lessertail = lesserhead;

        ListNode greaterhead  = new ListNode(-1);
        ListNode greatertail = greaterhead;

        ListNode temp = head;

        while(temp != null){

            if(temp.val < x){
              ListNode valueToinsert = temp;
                 temp = temp.next;
                 valueToinsert.next = null;
                 lessertail.next = valueToinsert;
                 lessertail = valueToinsert;

            }
            else{
                ListNode valueToinsert  = temp;
                temp = temp.next;
                valueToinsert.next = null;
                greatertail.next = valueToinsert;
                greatertail = valueToinsert;

            }
        }
        lessertail.next = greaterhead.next;
        greatertail.next = null;


        lesserhead = lesserhead.next;

        return lesserhead;
    }
}