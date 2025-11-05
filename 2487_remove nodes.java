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
import java.util.Stack;

class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode r = head;
        if (head == null || head.next == null) {
            return head;
        }

        Stack<ListNode> store = new Stack<>();

        
        while (r != null) {
            while (!store.isEmpty() && store.peek().val < r.val) {
                store.pop();
            }
            store.push(r);
            r = r.next;
        }

       
        ListNode result = null;
        while (!store.isEmpty()) {
            ListNode node = store.pop();
            node.next = result;
            result = node;
        }

        return result;
    }
}
