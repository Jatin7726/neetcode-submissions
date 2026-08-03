/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        // val visited = mutableSetOf<ListNode>()
        // var curr = head
        // while(curr != null){
        //     if(visited.contains(curr)){
        //         return true
        //     }
        //     visited.add(curr)
        //     curr= curr.next
        // }
        // return false
    
        var slow:ListNode?= head
        var fast:ListNode?= head
        while(fast!=null && fast.next !=null){
            slow = slow?.next
            fast = fast.next?.next
            if(slow == fast){
                return true
            }
        }
        return false

    }
}
