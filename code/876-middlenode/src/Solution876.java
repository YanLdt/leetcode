/**
 * @Author: YanL
 * @Time: 9:19 2020/3/23
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Solution876 {
    public static ListNode middleNode(ListNode head){
        //快慢指针，快指针到末尾的时候，慢指针刚好到中间
        ListNode fast = head, slow = head;
        while(slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
