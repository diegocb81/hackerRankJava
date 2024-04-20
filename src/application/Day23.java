package application;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Nod {
	Nod left, right;
	int data;
	
	Nod(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23 {
	
	static void levelOrder(Nod root) {
		Queue<Nod> q = new LinkedList<>();
		q.add(root);
		
		while (!q.isEmpty()) {
			Nod temp = q.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
		}
	}
	
	public static Nod insert(Nod root, int data) {
		if (root == null) {
			return new Nod(data);
		} else {
			Nod cur;
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
		Nod root = null;
		while (T-- > 0) {
			int data = scanner.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
		scanner.close();
	}
}
