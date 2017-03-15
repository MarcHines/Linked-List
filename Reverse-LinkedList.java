/*
Given a linked list, reverse the order of the elements in the list. ie. 1->2->3->4   Result: 4->3->2->1

There are a couple of ways to do this. My personal favorite is recursively; however, with a little more code
you can do this interatively as well. Intuitively, we can also use a stack. I will demonstrate the recursive
solution.
*/

//Recursive
public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return newNode;
    }
