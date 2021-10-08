package hashTable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	          //  StackArray array = new StackArray(4);
		       Employee venumadhav = new Employee("Venu","madhav", 23);
			   Employee madhavsiva = new Employee("madhav","siva", 25);
			   Employee sivakeshavn = new Employee("siva","keshavn", 27);
			   Employee keshavram = new Employee("keshav","ram", 29);
			   Employee ramvenu = new Employee("ram","venu", 31);
				
			   SimpleHashTable ht = new SimpleHashTable();
			   ht.put("madhav", venumadhav);
			   ht.put("siva", madhavsiva);
			   ht.put("keshavn", sivakeshavn);
			   ht.put("ram", keshavram);
			   ht.put("venu", ramvenu);
			   ht.printHashTable();
			   System.out.println();

			 //  System.out.println(ht.get("madhav"));
			 //  System.out.println(ht.get("ram"));
			   
			   
			}
	}

