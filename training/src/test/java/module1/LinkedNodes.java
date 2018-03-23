package module1;

import java.util.Scanner;

public class LinkedNodes {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

	public static Node insert(Node head, int data) {
		if (head == null)
			return new Node(data);
		else if (head.next == null) {
			head.next = new Node(data);
		} else {
			insert(head.next, data);
		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

/*
 * Input 4 2 3 4 1 T=4 , so the locked code in the editor will be inserting
 * nodes. The list is initially empty, so is null; accounting for this, our code
 * returns a new node containing the data value as the of our list. We then
 * create and insert nodes , , and at the tail of our list. The resulting list
 * returned by the last call to is , so the printed output is 2 3 4 1.
 */