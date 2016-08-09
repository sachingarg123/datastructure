package linkedList;

public class LinkedList<E> {
	private Node<E> head;

	public void insertAtHead(E data) {
		Node<E> newNode = new Node<E>(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public void deleteAtHead() {
		Node<E> current = head.getNextNode();
		this.head = current;
	}

	public Node<E> find(E data) {
		Node<E> current = head;
		while (current != null) {
			if (current.getClass().equals(data)) {
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}

	public int length() {
		int length = 0;
		Node<E> currentNode = this.head;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNextNode();
		}
		return length;

	}

	@Override
	public String toString() {
		String result = "{ ";
		Node current = this.head;

		while (current != null) {
			result += current.toString() + ",";
			current = current.getNextNode();
		}

		result += "}";
		return result;
	}

}
