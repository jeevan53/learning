package reverseLinkedList;

public class reverseNode {

	private Reverse reverse;
	private reverseNode next;
	public reverseNode(Reverse reverse) {
		this.reverse = reverse;
	}
	public Reverse getReverse() {
		return reverse;
	}
	public void setReverse(Reverse reverse) {
		this.reverse = reverse;
	}
	public reverseNode getNext() {
		return next;
	}
	public void setNext(reverseNode next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return reverse.toString();
	}
}
