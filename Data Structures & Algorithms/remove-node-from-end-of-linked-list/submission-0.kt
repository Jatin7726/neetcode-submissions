/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
          val dummy = ListNode(0)
        dummy.next = head

        var fast: ListNode? = dummy
        var slow: ListNode? = dummy

        // Move fast pointer n + 1 steps ahead
        for (i in 0..n) {
            fast = fast?.next
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next
            slow = slow?.next
        }

        // Remove the nth node from the end
        slow?.next = slow?.next?.next

        return dummy.next
    }
}
