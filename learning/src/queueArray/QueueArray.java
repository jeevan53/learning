package queueArray;

import java.util.NoSuchElementException;


public class QueueArray {
	private Employee[] queue;
	private int front;
	private int back;
	
	public QueueArray(int capacity) {
		queue = new Employee[capacity];
	}
	public void enQueue(Employee employee) {
		if(back==queue.length) {
			//resize
			Employee[] newQueue = new Employee[2* queue.length];
			System.arraycopy(queue,0,newQueue,0,queue.length);
			queue = newQueue;
		}
		queue[back++] = employee;
	}
	
	
	public Employee peek() {
		if(Size()==0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	
	public Employee deQueue() {
		if(Size()==0) {
			throw new NoSuchElementException();
		}
		Employee employee = queue[front];
	queue[front] = null;
	front++;
	if(Size()==0) {
		front = 0;
		back = 0;
	}
		return employee;
	}
	
	public int Size() {
		return back-front;
	}
	public void printArray() {
		for(int i=front;i<back;i++) {
			System.out.println(queue[i]);
		}
	}
}
