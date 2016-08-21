package LeetCode;

public class isSameTree {

	public static void main(String[] args) {
		isSameTree ist = new isSameTree();
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(1);
		// ist.isSameTree(tn1, tn2);
		System.out.println(ist.isSameTree(tn1, tn2));

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null || q == null) {

			return p == q;
		}
		if (p.val != q.val) {

			return false;
		}

		return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);// RecursiveµÝ¹é

	}

}
