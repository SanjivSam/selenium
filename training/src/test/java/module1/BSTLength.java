package module1;

import java.util.*;
import java.io.*;

class BNode {
	BNode left, right;
	int data;

	BNode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BSTLength {
	public static BNode insert(BNode root, int data) {
		if (root == null) {
			return new BNode(data);
		} else {
			BNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		BNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}

	private static int getHeight(BNode root) {
		// TODO Auto-generated method stub
		int lfht = 0;
		int rhht = 0;
		if (root.left != null) {
			lfht = getHeight(root.left) + 1;
		}
		if (root.right != null) {
			rhht = getHeight(root.right) + 1;
		}
		return (lfht > rhht ? lfht : rhht);
	}
}
