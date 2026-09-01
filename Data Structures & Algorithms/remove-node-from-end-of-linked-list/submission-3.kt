/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
       
        //ye yaad rkhna jitne bhi dummy node pattern use ho
        val dummy:ListNode? = ListNode(0)
        dummy?.next = head
        var slow:ListNode?  = dummy
        var fast:ListNode? = dummy

        //now fast ko n+1 traverse kralo
        for(i in 0..n){
            fast = fast?.next
        }  

        //slow aur fast dono chalyege tbtk jbtk fast null nhi ho jata
        while(fast!=null){
            slow = slow?.next
            fast = fast?.next
        }
        //ab node pta chal gya ab usko remove krdo
        slow?.next = slow.next?.next
        return dummy?.next

    }
}
