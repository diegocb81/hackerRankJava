package application;

import java.util.Scanner;

class Nodes {
	Nodes left, right;
	int data;
	Nodes(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22 {
	
	public static int getHeight(Nodes root) {
		if (root == null) {
			return -1;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		return 1 + (Math.max(leftHeight, rightHeight));
	}
	
	public static Nodes insert(Nodes root, int data) {
		if (root == null) {
			return new Nodes(data);
		} else {
			Nodes cur;
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		Nodes root = null;
		while (T-- > 0) {
			int data = scanner.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
		scanner.close();
	}
}
