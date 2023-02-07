
public class LinkedList {
	public class Node {
		private int value;
		private Node next;

		private Node(int item) {
			this.value = item;

		}
	}

	private Node first;
	private Node last;

	public void addLast(int item) {
		Node node = new Node(item);
		node.next = null;
		if (isEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public void addFirst(int item) {
		Node node = new Node(item);
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
		first = first.next;
	}

	public void removeLast() {
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

}
