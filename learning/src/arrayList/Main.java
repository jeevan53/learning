package arrayList;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList= new ArrayList<>();
		employeeList.add(new Employee("Siva","Venu",23));
		employeeList.add(new Employee("Ram","Hari",262));
		employeeList.add(new Employee("Hema","Keshav",212));
		
		//Employee emp1 = new Employee("Siva", "venu", 1);
		//System.out.println(emp1);
		
		//employeeList.forEach(employee -> System.out.println(employee));
		
		employeeList.set(2, new Employee("jeeva","bagadi",53));

		employeeList.forEach(employee -> System.out.println(employee));
		
		System.out.println(employeeList.get(1));
		
		System.out.println(employeeList.isEmpty());
		
		System.out.println(employeeList.remove(2));
		
		employeeList.forEach(employee -> System.out.println(employee));
		
		System.out.println(employeeList.size());
	}

}
