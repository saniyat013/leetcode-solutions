package com.saniyat.problemSolving.leetcodeSolutions.oneProblemaDay;

//Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class SymmetricTree {
	public static boolean isSymmetric(TreeNode root) {
		if(root.left == null && root.right == null) {
			return true;
		}
		
		while(root.left != null && root.right != null) {
			
		}
		
		
		
		return true;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);

		TreeNode t1 = root.left = new TreeNode(2);
		TreeNode t2 = root.right = new TreeNode(2);

		TreeNode t3 = t1.left = new TreeNode(3);
		TreeNode t4 = t1.right = new TreeNode(4);

		TreeNode t5 = t2.left = new TreeNode(3);
		TreeNode t6 = t2.right = new TreeNode(4);

		System.out.println(isSymmetric(root));

	}
}