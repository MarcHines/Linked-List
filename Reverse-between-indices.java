/*
 Reverse a linked list from position m to n. Do it in-place and in one-pass.
For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,
return 1->4->3->2->5->NULL. 
Simply just reverse the list along the way using 4 pointers: dummy, pre, start, then
*/

public ListNode reverseBetween(ListNode head, int m, int n) {
       if(head == null) return head;
     
       ListNode dummy = new ListNode(0);
       dummy.next = head;
       ListNode pre = dummy;
       
       for(int i = 0; i < m - 1; i++) pre = pre.next;
       
       ListNode start = pre.next; //Start of sublist to be reversed
       ListNode then = start.next;//Pointer to a node that will be reversed
       
       //sttp ptts
       for(int j = 0; j < n - m; j++){
           start.next = then.next;
           then.next = pre.next;
           
           pre.next = then;
           then = start.next;
       }
       
       return dummy.next;
    }
