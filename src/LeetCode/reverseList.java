package LeetCode;

public class reverseList {

	public static void main(String[] args) {
		ListNode ln = new ListNode(3);
		
		reverseList rl = new reverseList();
		
		System.out.println(rl.reverseList(ln));

	}
	
	 public ListNode reverseList(ListNode head) {
		 
		 ListNode rln = new ListNode(head.val);
		 for(int i=head.val;i>0;i--){
			 rln.next = head.next;
		 }
		 
		return head.next;
	 }

}
