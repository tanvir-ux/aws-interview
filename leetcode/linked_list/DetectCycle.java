class DetectCycle {
    static ListNode detectCycle(ListNode head) {        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {//where both meet
                slow = head;//reset the slow pointer
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;//or fast both are at the same position
            }
        }
        return null;
    }
}