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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode first = list1;
        ListNode second = list2;
        ListNode nextHead = null;
        ListNode newHead = new ListNode();
        ListNode current = newHead;

        if(first == null && second == null ){

                return newHead.next;
            
        }
        else{
            while(first != null && second != null){

                if(first.val >= second.val){
                    nextHead = second.next;
                    current.next = second;
                    second = nextHead;
                }
                else{
                    nextHead = first.next;
                    current.next = first;
                    first = nextHead; 
                }
                current = current.next;
            }
            current.next = (first!= null)?first:second;

            return newHead.next;
        }
    }
}