package java_Basics;

public class methodOverloading {
	static void go() {
		int[] array = {21,22};
		System.out.println("Element at position 0: "+array[0]);
		System.out.println("Element at position 1: "+array[1]);
	}
	static void go(int no)
	{
		System.out.println("Number: "+no);
	}
	static void go(short id)
	{	
		System.out.println("ID: "+id);
	}
	
	static void varagsOverload(boolean b, int i,int j,int k)
	{
		System.out.println("i value: "+i);
		System.out.println("j value: "+j);
		System.out.println("k value: "+k);
	}
	static void varagsOverload(boolean b,int... list)
	{
		System.out.println("length is : "+list.length);
	}
	static int reverse(int num) {
		int rev=0;
		for(;num!=0;num=num/10) {
			
			int digit = num%10;
			rev = rev*(10)+digit;
			//System.out.println(rev);
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		go();
		go(1000);
		byte a =15;
		go(a);
		varagsOverload(true, 1,2,3);
		varagsOverload(true, 1,2,3,4,5,6,7,8,9,0);
		varagsOverload(true);
		System.out.println("reverse of number 479 is : "+reverse(479));
	}

}
