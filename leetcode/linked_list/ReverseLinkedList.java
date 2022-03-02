class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode n = head.next;
            head.next = prev;
            prev = head;
            head = n;
        }
        return prev;
    }
}