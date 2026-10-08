/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
       ListNode a = headA;
       ListNode b = headB;
       //travel both Node form a and b and  find the length of it.
        while(a != null && b != null){
            a = a.next;
            b = b.next;

        }
        if(a == null){
            //ga tah vadi list ka len badi n ak ga for equal hai 
            int bExtralen = 0;
            while(b != null){
                bExtralen ++;
                b = b.next;
            }
            while(bExtralen-- >0){
                headB = headB.next;

            }

            }
            else{
                //b = null
                //a wali list Node hb se gay eval bhi
                int aExtralen = 0;
                while(a!=null){
                    aExtralen ++;
                    a = a.next;
                }
                while(aExtralen-- >0){
                    headA = headA.next;
                } 
            }
            //ab mare pass head A ans head B is tareaks se lage hue hk anse start krta hai
            // end tak jaya ho done last me same no of  node nodelength.
       while(headA !=null && headB !=null){
        if(headA ==headB){
            return headA;
        }
        else{
            headA= headA.next;
            headB = headB.next;
        }
       }
       return null;
        
    }
}