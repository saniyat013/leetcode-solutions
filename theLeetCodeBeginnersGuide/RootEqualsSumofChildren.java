package com.saniyat.problemSolving.leetcodeSolutions.theLeetCodeBeginnersGuide;

public class RootEqualsSumofChildren {

//	  Definition for a binary tree node
	static class TreeNode {
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

	public static boolean checkTree(TreeNode root) {
		return (root.val == (root.left.val + root.right.val));
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(1);

		System.out.println(checkTree(root));
	}
}
