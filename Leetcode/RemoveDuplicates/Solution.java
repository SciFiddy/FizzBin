package RemoveDuplicates;


/**

 https://leetcode.com/problems/remove-duplicates-from-sorted-list/

     Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

     Example 1:

     Input: head = [1,1,2]
     Output: [1,2]

     Example 2:

     Input: head = [1,1,2,3,3]
     Output: [1,2,3]

     Constraints:

     The number of nodes in the list is in the range [0, 300].
     -100 <= Node.val <= 100
     The list is guaranteed to be sorted in ascending order.

 */
class Solution {

    public static ListNode deleteDuplicates(ListNode head) {

        if (null == head) return head;
        if (null == head.next) return head;
        ListNode n = head;
        while (null!=n.next) {
            if (n.val == n.next.val) {
                n.next = n.next.next;

            } else {
                n = n.next;
            }
        }
        return head;
    }

    public static String displayNodes(ListNode node) {
        if (null != node.next) {
            return node.val + ", " + displayNodes(node.next);
        }
        return node.val + "";
    }

    public static void main(String[] args) {
        ListNode listHead;
        var n = new ListNode(3);
        n = new ListNode(2, n);
        System.out.println(displayNodes(n));
        System.out.println(displayNodes(deleteDuplicates(n)));

        listHead = new ListNode(50);
        listHead = new ListNode(3, listHead);
        listHead = new ListNode(2, listHead);
        listHead = new ListNode(1, listHead);
        listHead = new ListNode(1, listHead);

        System.out.println(displayNodes(listHead));
        System.out.println(displayNodes(deleteDuplicates(listHead)));


        listHead = new ListNode(50);
        listHead = new ListNode(3, listHead);
        listHead = new ListNode(3, listHead);
        listHead = new ListNode(3, listHead);
        listHead = new ListNode(2, listHead);
        listHead = new ListNode(2, listHead);
        listHead = new ListNode(2, listHead);
        listHead = new ListNode(2, listHead);
        listHead = new ListNode(1, listHead);
        listHead = new ListNode(1, listHead);

        System.out.println(displayNodes(listHead));
        System.out.println(displayNodes(deleteDuplicates(listHead)));


    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}