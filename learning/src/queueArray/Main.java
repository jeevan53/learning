package queueArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            QueueArray array = new QueueArray(4);
		        array.enQueue(new Employee("Venu","madhav", 23));
				array.enQueue(new Employee("madhav","siva", 25));
				array.enQueue(new Employee("siva","keshav", 27));
				array.enQueue(new Employee("keshav","ram", 29));
				array.enQueue(new Employee("ram","venu", 31));
				
				System.out.println(array.Size());
				array.printArray();
				System.out.println();
				
				System.out.println(array.peek());
				System.out.println();
				array.printArray();
				System.out.println();
				
				array.deQueue();
				array.deQueue();
				array.printArray();
			}
	}

