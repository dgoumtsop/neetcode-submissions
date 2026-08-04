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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null; // list is empty
        }
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)-> a.val - b.val);
        for(ListNode lis : lists){
            if(lis != null){
                minHeap.offer(lis);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(!minHeap.isEmpty()){
            ListNode minNode = minHeap.poll();
            curr.next = minNode;
            curr = curr.next;
            if(minNode.next != null){
                minHeap.offer(minNode.next);
            }
        }
        return dummy.next;
    }
}
