public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        l1 = reverseList(l1);
        l2 = reverseList(l2);

        int carry = 0;
        int val1 = 0;
        int val2 = 0;

        if (l1 != null) val1 = l1.val;
        else val1 = 0;
        if (l2 != null) val2 = l2.val;
        else val2 = 0;

        int add = val1 + val2;

        if (add >= 10) {
            add %= 10;
            carry = 1;
        }

        ListNode node = new ListNode(add);
        ListNode ret = node;
        l1 = l1.next;
        l2 = l2.next;


        while (l1 != null || l2 != null) {

            if (l1 != null) val1 = l1.val;
            else val1 = 0;
            if (l2 != null) val2 = l2.val;
            else val2 = 0;


            add = val1 + val2 + carry;
            if (add >= 10) {
                add %= 10;
                carry = 1;
            } else carry = 0;
            node.next = new ListNode(add);
            node = node.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) node.next = new ListNode(1);

        return reverseList(ret);
    }


    private ListNode reverseList(ListNode l){
        ListNode ret = new ListNode(l.val);
        l = l.next;
        while(l != null){
            ListNode tmp = new ListNode(l.val);
            tmp.next = ret;
            ret = tmp;
            l = l.next;
        }
        return ret;
    }
}
