class RemoveDuplicates2 {
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

    static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode FakeHead = new ListNode(0);
        FakeHead.next = head;
        ListNode prev = FakeHead;
        ListNode current = head;
        while(current != null){
            while(current.next != null && current.val == current.next.val) {
                current = current.next;
            }
            if(prev.next == current) {
                prev = prev.next;
            } else {
                prev.next = current.next;
            }
            current = current.next;
        }
        return FakeHead.next;
    }

}