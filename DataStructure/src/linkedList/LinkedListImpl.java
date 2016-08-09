package linkedList;

public class LinkedListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		LinkedList<Circle> linkedListImp = new LinkedList<Circle>();
		linkedListImp.insertAtHead(new Circle(5));
		linkedListImp.insertAtHead(new Circle(10));
		linkedListImp.insertAtHead(new Circle(20));
		linkedListImp.insertAtHead(new Circle(21));
		linkedListImp.insertAtHead(new Circle(13));
		linkedListImp.insertAtHead(new Circle(11));
		linkedListImp.deleteAtHead();
		linkedListImp.deleteAtHead();
		
		
		System.out.println(linkedListImp);
		System.out.println(linkedListImp.length());
		System.out.println(linkedListImp.find(new Circle(5)));
		System.out.println(linkedListImp.find(new Circle(11)));

	}

}
