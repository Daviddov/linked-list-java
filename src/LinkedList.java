import java.util.Iterator;

public class LinkedList {

	public class Node {
		private int value;
		private Node next;

		private Node(int item) {
			this.value = item;
		}
	}

	public Node first;
	private Node last;
	private int size = 0;

	public void addLast(int item) {
		Node node = new Node(item);
		node.next = null;
		this.size++;
		if (isEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public void addFirst(int item) {
		Node node = new Node(item);
		this.size++;
		if (isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}

	private boolean isEmpty() {
		return first == null;
	}

	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		while (current != null) {
			if (current.value == item) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;

	}

	public boolean contains(int item) {
		return indexOf(item) != -1;
	}

	public void removeFirst() {
		this.size--;
		first = first.next;
	}

	public void removeLast() {
		this.size--;
		Node prev = getPrevious(last);
		prev.next = null;
		last = prev;
	}

	private Node getPrevious(Node node) {
		Node current = first;
		while (current != null) {
			if (current.next == node) {
				break;
			}
			current = current.next;
		}
		return current;
	}

	public int getSize() {

		return this.size;
	}

	public int[] toArray() {
		Node current = first;
		int index = 0;
		int[] array = new int[size];

		while (current != null) {
			array[index++] = current.value;
			current = current.next;
		}
		return array;
	}

	public void reverse() {
		Node prev = null;
		Node current = first;
		Node next = null;
		Node tempNode;
		while(current != null) {
			next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		
		tempNode = first;
		first = last;
		last = tempNode;
		}

	public int fromLast(int num) {
		Node stopNode =first;
		Node current = first;
		for (int i = 0; i < num; i++) {
			stopNode = stopNode.next;
		}
		while(stopNode != null) {
			current = current.next;
			stopNode = stopNode.next;
		}
		return current.value;
		
	}
}
