package linkedList;

public class DoublyLinkedList {

	private Node head;
	
	
	public void insertAtHead(int data){
		Node newNode = new Node(data);
		
		newNode.setNextNode(this.head);
		if(this.head!=null){
			head.setPreviousNode(newNode);
		}
		this.head=newNode;
	}
	
	
	public int length() {
		int length = 0;
		Node currentNode = this.head;
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
