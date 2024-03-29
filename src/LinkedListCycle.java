public class LinkedListCycle {
    public static void main(String[] args) {

        class Solution {
            public boolean hasCycle(ListNode head) {
                ListNode fast = head;
                ListNode slow = head;

                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;

                    if (slow == fast)
                        return true;
                }

                return false;
            }
        }
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

