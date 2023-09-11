package removeNodesFromLinkedList;



class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head.next == null){
            return head;
        }
        ListNode res = new ListNode();

        //printNodes(head);



        //System.out.println("In reverse");
        ListNode ln = reverse(head);
        //printNodes(ln);

        ListNode newHead = new ListNode(ln.val);
        int max = -1;
        while (ln != null){
            max = Math.max(max, ln.val);
            ln = ln.next;
            if (ln == null){
                break;
            }
            if (ln.val >= max){
                newHead = new ListNode(ln.val, newHead);
            }
        }
        //System.out.println("after removing");
        //printNodes(newHead);
        res = newHead;
        //res = reverse(newHead);
        //reversedHead = new ListNode(next.val, )
        return res;
    }

    private void printNodes(ListNode head){
        ListNode ln = head;
        while(ln != null){
            System.out.println(ln.val);
            ln = ln.next;
        }
    }

    private ListNode reverse(ListNode head){
        ListNode reversedHead = new ListNode(head.val);
        ListNode prev = head;
        ListNode next = head.next;
        while (next != null){
            reversedHead = new ListNode(next.val, reversedHead);
            next = next.next;
            prev = prev.next;
        }
        return reversedHead;
    }
}