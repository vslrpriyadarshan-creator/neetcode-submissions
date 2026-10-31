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

        int listEnd = 0;
        ListNode currentNode = head;
        ListNode newHead = null;
        while(currentNode != null){

            listEnd++;
            currentNode = currentNode.next;
        }
        int mid = (listEnd / 2);
        listEnd  = 0;
        System.out.println(1/2);
        currentNode = head;
        if(mid == 0){
            return head;
        }
        else
        {
            while(listEnd <= mid){
                newHead = currentNode;
                currentNode = currentNode.next;
                listEnd++;
            }
            return newHead;
        }
        
    }
}