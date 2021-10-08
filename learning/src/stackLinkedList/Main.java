package stackLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackList list = new StackList();
		list.push(new Employee("Venu","madhav", 23));
		list.push(new Employee("madhav","siva", 25));
		list.push(new Employee("siva","keshav", 27));
		list.push(new Employee("keshav","ram", 29));
		list.push(new Employee("ram","venu", 31));
		
		System.out.println(list.size());
		list.printlist();
		System.out.println();
		
		System.out.println(list.peek());
		System.out.println();
		list.printlist();
		System.out.println();
		
		list.pop();
		list.pop();
		list.printlist();
	}

}
