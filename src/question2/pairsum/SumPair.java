package question2.pairsum;

import java.util.HashSet;
import java.util.Set;

public class SumPair {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(40);
		root.insertData(40, root);
		root.insertData(20, root);
		root.insertData(60, root);
		root.insertData(70, root);
		root.insertData(10, root);
		root.insertData(80, root);

		int targetSum = 130;

		Set<Integer> data = new HashSet<Integer>();
		if (!findSumPair(root, targetSum, data)) {
			System.out.println("Pair not found for given Sum.");
		}
	}
	private static boolean findSumPair(TreeNode root, int targetSum, Set<Integer> data) {
		if (root == null) {
			return false;
		}
		
		if (findSumPair(root.left, targetSum, data)) {
			return true;
		}
		int remainder = targetSum - root.data;
		if (data.contains(remainder)) {
			System.out.println("The Pair(" + root.data + "," + remainder + ") can form the given Sum");
			return true;
		} else {
			data.add(root.data);
		}
		return findSumPair(root.right, targetSum, data);
	}
}
