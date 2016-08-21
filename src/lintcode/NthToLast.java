package lintcode;

public class NthToLast {
	public static void main(String[] args) {
		NthToLast ntl = new NthToLast();
		ListNode ln = new ListNode(3);
		ln.next = new ListNode(2);
		ln.next.next = new ListNode(1);
		ln.next.next.next = new ListNode(5);

		System.out.println(ntl.nthToLast(ln, 2));
	}

	ListNode nthToLast(ListNode head, int n) {
		// head.
		// head.next=new ListNode(2);
		return head;
	}
}
