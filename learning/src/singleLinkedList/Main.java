package singleLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		employeeList.add(new Employee("Siva","Venu",23));
		employeeList.add(new Employee("Ram","Hari",262));
		employeeList.add(new Employee("Hema","Keshav",212));
		
		*/
		
		Employee sivavenu = new Employee("Siva","Venu",23);
		Employee ramhari = new Employee("Ram","Hari",262);
		Employee hemakesav = new Employee("Hema","Keshav",212);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		System.out.println(list.isEmpty());
		list.addFront(sivavenu);
		list.addFront(ramhari);
		list.addFront(hemakesav);
		System.out.println(list.getSize());
		list.printlist();
		System.out.println();
		list.removeFront();
		System.out.println(list.getSize());
		list.printlist();
		System.out.println();
		System.out.println(list.isEmpty());
	}

}

