package suanfa;

import java.util.Scanner;
import LeetCode.ListNode;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 
 * @author Administrator
 *
 */
public class KthtoTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ListNode head = null;
		if (in.hasNextInt()) {
			head = new ListNode(in.nextInt());
		}
		ListNode temp = head;
		while (in.hasNextInt()) {
			temp.next = new ListNode(in.nextInt());
			temp = temp.next;
		}
		in.close();
		System.out.println(FindKthToTail(head, 2).val);
	}

	/**
	 * travel 2 times
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k <= 0)
			return null;

		int n = 0;
		ListNode ln = head;
		while (ln != null) {
			n++;
			// System.out.println("1: "+ln.val);
			ln = ln.next;
		}
		// System.out.println("------: "+n);
		int i = 0;
		if (k > n)
			return null;
		while (i < (n - k)) {
			head = head.next;
			i++;
		}
		return head;
	}

}
