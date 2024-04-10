package application;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	
	Node(int d) {
		data = d;
		next = null;
	}
}

public class Day15 {
	
	public static Node insert(Node head, int data) {
		Node newNode = new Node(data);
		Node current = head;
		
		if (head == null) return newNode; 
		if (head.next == null) {
			head.next = newNode;
			return head;
		}
		
		while (current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
		return head;	
	}
	
	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Node head = null;
		int n = scanner.nextInt();
		
		while (n-- > 0) {
			int ele = scanner.nextInt();
			head = insert(head, ele);
		}
		display(head);
		scanner.close();
	}
}
