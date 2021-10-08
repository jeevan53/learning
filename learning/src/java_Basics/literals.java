package java_Basics;

public class literals {

	static int computeCount;
	int id;
	String name;
	String gender;
	int age;
	long phone;
	float gpa;
	char degree;
	boolean international = true;
	double tuitionFees = 12000.0;
	double internationalFees = 5000.0;
	// '\u0042' (66) or char degree = 65 or char charHexa = 0x0041(base 16)
	
	void compute() {
		int nextid = id+1;
		computeCount = computeCount +1;
		if(international) {
			tuitionFees = internationalFees + tuitionFees;
		}
		
		System.out.println("id: "+id);
		System.out.println("nextid:"+nextid);
		System.out.println("name: "+name);
		System.out.println("gender: "+gender);
		System.out.println("phone: "+phone);
		System.out.println("age: "+age);
		System.out.println("gpa: "+gpa);
		System.out.println("Degree: "+degree);
		System.out.println("tution fees: "+tuitionFees);
		System.out.println("computeCount: "+computeCount);
		System.out.println();
		}
	
	 void primitives() {
		int intHexa = 0x0041;
		int intBinary = 0b01000001;
		int intOctal = 0101;
		System.out.println("intHexa: "+intHexa);
		System.out.println("intBinary: "+intBinary);
		System.out.println("intOctal: "+intOctal);
		System.out.println(1-0.9);
		System.out.println(0.1+0.2);
		System.out.println(1000 * 0.1);
		System.out.println(1000*(1-0.9));
		System.out.println();
	}
	  literals(int newId,String newName,String newGender,int newAge,long newPhone,float newGpa,char newDegree,boolean newInternational) {
		this(newId,newName, newGender, newAge, newPhone, newGpa, newDegree);
	 }
	  literals(int newId,String newName,String newGender,int newAge,long newPhone,float newGpa,char newDegree) {
		    id = newId;
			name = newName;
			gender = newGender;
			age = newAge;
			phone = newPhone;
			gpa = newGpa;
			degree= newDegree;
		//	international = newInternational;
			compute();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	literals l4 = new literals(11,"venu","M",24,9848022338L,3.7f,'A',true);
	//	literals l1 = new literals(20,"Max","M",26,234567890L,3.4f,'B');
		
		//l1.primitives();
		//l1.compute();

		/*
		literals l2 = new literals();
		l2.id = 22;
		l2.name = "Pralay";
		l2.gender = "M";
		l2.age = 24;
		l2.phone = 231567890L;
		l2.gpa = 3.5f;
		l2.degree= 'A';
		l2.international = true;
		l2.compute();
		
		literals l3 = new literals();
		l3.id = 24;
		l3.name = "Sivani";
		l3.gender = "F";
		l3.age = 23;
		l3.phone = 234167890L;
		l3.gpa = 3.3f;
		l3.degree= 'C';
		l3.international = false;
		l3.compute();
		*/
		}

}
