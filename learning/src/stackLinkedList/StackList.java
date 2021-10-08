package stackLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class StackList {

	private LinkedList<Employee> stack;
	
	public StackList() {
		stack = new LinkedList<>();
	}
	
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public Employee peek() {
		return stack.peek();
	}
	public Employee pop() {
		return stack.pop();
	}
	
	public int size() {
		return stack.size();
	}
	
	public void printlist() {
		ListIterator<Employee> iterator = stack.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
