package jdkLinkedList;


import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee sivavenu = new Employee("Siva","Venu",23);
		Employee ramhari = new Employee("Ram","Hari",262);
		Employee hemakesav = new Employee("Hema","Keshav",212);
		Employee venumadhav = new Employee("Venu","Madhav",300);
		
		LinkedList<Employee> list= new LinkedList<>();
		list.addFirst(sivavenu);
		list.addFirst(ramhari);
		list.addFirst(hemakesav);
		
		System.out.println(list.size());
		System.out.print("Head <=>");
		for(Employee employee:list) {
			System.out.print(employee);
			System.out.print(" <=> ");
		}
		System.out.print("null");
		System.out.println();
		
		list.add(venumadhav);
		System.out.println(list.size());
		System.out.print("Head <=>");
		for(Employee employee:list) {
			System.out.print(employee);
			System.out.print(" <=> ");
		}
		System.out.print("null");
		System.out.println();
		
		list.removeLast();
		System.out.println(list.size());
		System.out.print("Head <=>");
		for(Employee employee:list) {
			System.out.print(employee);
			System.out.print(" <=> ");
		}
		System.out.print("null");
		System.out.println();
		
		list.remove();
		System.out.println(list.size());
		System.out.print("Head <=>");
		for(Employee employee:list) {
			System.out.print(employee);
			System.out.print(" <=> ");
		}
		System.out.print("null");
		System.out.println();
		//Employee emp1 = new Employee("Siva", "venu", 1);
		//System.out.println(emp1);
		
		//employeeList.forEach(employee -> System.out.println(employee));
		
		//employeeList.set(2, new Employee("jeeva","bagadi",53));

	}

}
