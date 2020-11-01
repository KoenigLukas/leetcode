# Definition for singly-linked list.
class ListNode
  attr_accessor :val, :next

  def initialize(val)
    @val = val
    @next = nil
  end
end

# @param {ListNode} l1
# @param {ListNode} l2
# @return {ListNode}
def add_two_numbers(l1, l2)

  node = ListNode.new(0)
  ret = node
  carry = 0
  until l1.nil? && l2.nil?
    val1 = l1.nil? ? 0 : l1.val
    val2 = l2.nil? ? 0 : l2.val
    x = val1 + val2 + carry
    if x >= 10
      carry = 1
      x %= 10
    else
      carry = 0
    end
    node.next = ListNode.new(x)
    node = node.next
    l1 = l1.next unless l1.nil?
    l2 = l2.next unless l2.nil?
  end
  node.next = ListNode.new(1) if carry == 1
  ret.next
end
