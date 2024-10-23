package algo;

class LinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// Function to merge two sorted linked lists
	Node sortedMerge(Node a, Node b) {
		if (a == null) return b;
		if (b == null) return a;
		
		Node result;
		if (a.data <= b.data) {
			result = a;
			result.next = sortedMerge(a.next, b);
		} else {
			result = b;
			result.next = sortedMerge(a, b.next);
		}
		return result;
	}
	
	// Function to split the linked list into two halves
	Node getMiddle(Node head) {
		if (head == null) return head;
		
		Node slow = head;
		Node fast = head.next;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	// Merge Sort for linked list
	Node mergeSort(Node h) {
		if (h == null || h.next == null) {
			return h;
		}
		
		// Get the middle of the list
		Node middle = getMiddle(h);
		Node nextOfMiddle = middle.next;
		
		// Set the next of middle node to null to split the list
		middle.next = null;
		
		// Apply mergeSort on both halves
		Node left = mergeSort(h);
		Node right = mergeSort(nextOfMiddle);
		
		// Merge the sorted halves
		return sortedMerge(left, right);
	}
	
	// Utility function to print the list
	void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	// Driver program to test the merge sort
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(15);
		list.head.next = new Node(10);
		list.head.next.next = new Node(5);
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(3);
		list.head.next.next.next.next.next = new Node(2);
		
		System.out.println("Unsorted List:");
		list.printList(list.head);
		
		list.head = list.mergeSort(list.head);
		
		System.out.println("Sorted List:");
		list.printList(list.head);
	}
}
