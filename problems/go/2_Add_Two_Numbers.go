package _go

type ListNode struct {
	Val  int
	Next *ListNode
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {

	var l3 *ListNode
	ret := l3
	carry := 0

	for l1.Next != nil || l2.Next != nil {
		sum := l1.Val + l2.Val
		if sum > 9 {
			carry = 1
			sum %= 10
		} else{
			carry = 0
		}
		l3.Val = sum + carry
		l3.Next = *ListNode
		l3 = l3.Next
		l1 = l1.Next
		l2 = l2.Next
	}

	return ret
}
