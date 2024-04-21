package application;

import java.util.Scanner;

class Nodex {
	int data;
	Nodex next;
	
	Nodex(int d){
		data = d;
		next = null;
	}
}

public class Day24 {
	
	public static Nodex removeDuplicates(Nodex head) {
		if (head == null) {
			return head;
		}
		
		Nodex current = head;
		
		while (current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
	
	public static Nodex insert(Nodex head, int data) {
		Nodex p = new Nodex(data);
		if (head == null) {
			head = p;
		} else if (head.next == null) {
			head.next = p;
		} else {
			Nodex start = head;
			while (start.next != null) {
				start = start.next;
			start.next = p;
			}
		}
		return head;
	}
	
	public static void display(Nodex head) {
		Nodex start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Nodex head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
		sc.close();
	}
}
