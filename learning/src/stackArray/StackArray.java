package stackArray;

import java.util.EmptyStackException;


public class StackArray {

	private Employee[] stack;
	private int top;
	
	public StackArray(int capacity) {
		stack = new Employee[capacity];
	}
	
	public void push(Employee employee) {
		if(top == stack.length) {
			//resize array
			Employee[] newStack = new Employee[2* stack.length];
			System.arraycopy(stack,0,newStack,0,stack.length);
			stack = newStack;
		}
		stack[top++] = employee;
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
			}
		return stack[top -1];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
			}
		Employee employee = stack[--top];
		stack[top]=null;
		return employee;
	}
	public int size() {
		return stack.length;
	}
	public void printArray() {
		for(int i=top -1;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}


}
