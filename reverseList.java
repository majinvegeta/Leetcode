/* Maintain 3 references in each iteration, one pointing to the previous node, one to 
the current, and one to the next (head itself). The trick is to get a reference to the
next node, before the link is broken. */

public ListNode reverseList(ListNode head) {
    ListNode prev = null,curr=null;
    while(head!=null){
        curr = head;
        head = head.next;
        curr.next = prev;
        prev = curr;           
    }
    return prev;
}