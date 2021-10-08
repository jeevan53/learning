package hashTable;

public class SimpleHashTable {

	private Employee[] hashtable;
	
	public SimpleHashTable() {
		hashtable = new Employee[10];
	}
	
	public int hashkey(String key) {
		return key.length() % hashtable.length;
	}
	
	public void put(String key, Employee employee) {
		int hashedkey = hashkey(key);
		if(hashtable[hashedkey]!= null) {
			System.out.println("Sorry, there is already element at position : "+hashedkey+" no insertion done for key : "+key);
		}
		else {
		hashtable[hashedkey] = employee;
	}
	}
	public Employee get(String key) {
		int hashedkey = hashkey(key);
		return hashtable[hashedkey];
	}
	
	public void printHashTable() {
		for(int i = 0;i<hashtable.length;i++) {
			System.out.println(hashtable[i]);
		}
	}
}
