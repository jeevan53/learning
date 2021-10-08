package reverseLinkedList;

public class reverseLinkedList {
	
	public reverseNode head;
	
	public void add(Reverse reverse) {
		
		reverseNode node = new reverseNode(reverse);
		node.setNext(head);
		head = node;
	}
	public void Output() {
		reverseNode current = head;
		while(current!=null) {
			System.out.println(current);
			current = current.getNext();
		}
	}
}

