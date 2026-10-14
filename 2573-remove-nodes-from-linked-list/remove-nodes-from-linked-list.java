
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr !=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
         ListNode curr = head;
    while(curr !=null && curr.next !=null){
        if(curr.val > curr.next.val){
            curr.next = curr.next.next;
        }else{
        curr = curr.next;
        }
    }
    return reverse(head);
    }
   
}