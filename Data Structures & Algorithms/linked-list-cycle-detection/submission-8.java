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
    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while(first != null && second != null && second.next!= null){

            if(first.next == second.next.next){
                return true;
            }
            first = first.next;
            second = second.next.next;

        }

        return false;

    }
}
