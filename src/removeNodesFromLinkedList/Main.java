package removeNodesFromLinkedList;

public class Main {


    public static void main(String[] args) {
        ListNode node4 = new ListNode(8);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(13, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(5, node1);

        Solution s = new Solution();
        s.removeNodes(head);

    }
}
