package linkedList;

public class DoublyLinkedListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertAtHead(20);
		doublyLinkedList.insertAtHead(21);
		doublyLinkedList.insertAtHead(12);
		doublyLinkedList.insertAtHead(19);
		doublyLinkedList.insertAtHead(10);
		
		System.out.println(doublyLinkedList);

	}

}
