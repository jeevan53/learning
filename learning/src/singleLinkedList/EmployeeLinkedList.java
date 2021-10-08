package singleLinkedList;

public class EmployeeLinkedList {

	private EmployeeNode head;
	public int size;
	
	public void addFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public EmployeeNode removeFront() {
		
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removeNode = head;
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}
	
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void printlist()
	{
		EmployeeNode current = head;
		System.out.print("Head -> ");
		while(current!= null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.print("null");
	}
}
