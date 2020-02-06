/**
 * @Author: YanL
 * @Time: 9:21 2020/2/6
 * @Email: imyanl.dt@gmail.com
 * @Description:
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
 * 并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        //设置进位
        int carry = 0;
        while(l1 != null || l2 != null){
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sum = l1Val + l2Val + carry;
            //更新进位
            carry = sum / 10;
            //添加新节点
            ListNode sumNode = new ListNode(sum % 10);
            cur.next = sumNode;
            cur = sumNode;

            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        if(carry == 1){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}


class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
            val = x;
    }
}