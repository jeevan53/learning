package stackArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            StackArray array = new StackArray(4);
		        array.push(new Employee("Venu","madhav", 23));
				array.push(new Employee("madhav","siva", 25));
				array.push(new Employee("siva","keshav", 27));
				array.push(new Employee("keshav","ram", 29));
				array.push(new Employee("ram","venu", 31));
				
				System.out.println(array.size());
				array.printArray();
				System.out.println();
				
				System.out.println(array.peek());
				System.out.println();
				array.printArray();
				System.out.println();
				
				array.pop();
				array.pop();
				array.printArray();
			}
	}

