class LinkedListCycle {
    static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slowRunner = head;
        ListNode fastRunner = head;
        while(fastRunner.next != null && fastRunner.next.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
            if(slowRunner == fastRunner) return true;
        }
        return false;
    }
}