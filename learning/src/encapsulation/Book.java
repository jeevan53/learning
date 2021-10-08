package encapsulation;

public class Book {

	private int noOfCopies;

	public Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if(noOfCopies>0)  //// no of copies less than 0, it will not perform operations 
		this.noOfCopies = noOfCopies;
	}
	
	public void incCopies(int n) {
		//noOfCopies += n;
		setNoOfCopies(noOfCopies+n);
	}
	public void decCopies(int x) {
		//noOfCopies = noOfCopies - x;
		setNoOfCopies(noOfCopies-x); // no of copies less than 0, it will not perform operations 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book(73);
		//b.setNoOfCopies(70);
		System.out.println(b.getNoOfCopies());
		b.incCopies(10);
		System.out.println(b.getNoOfCopies());
		b.decCopies(90);
		System.out.println(b.getNoOfCopies());
	}

}
