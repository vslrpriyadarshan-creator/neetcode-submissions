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
    public ListNode middleNode(ListNode head) {

        int listLength = 0;
        ListNode currentNode = head;
        ListNode newHead = null;
        while(currentNode != null){

            listLength++;
            currentNode = currentNode.next;
        }
        int mid = (listLength / 2);
        System.out.println(mid);
        int findMid = 0;
        currentNode = head;
        if(listLength == 1){
            return head;
        }
        else
        {
            while(findMid <= mid){
                newHead = currentNode;
                currentNode = currentNode.next;
                findMid++;
            }
            return newHead;
        }
        
    }
}