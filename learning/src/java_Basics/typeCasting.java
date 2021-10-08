package java_Basics;

public class typeCasting {
	public static void  typecasting() {
		System.out.println("/n Inside TypeCasting");
		//Explicit Casting
		long y = 42;
		//int x = y;
		int x = (int) y;
		
		//literal to Byte
		//Information loss (out of range assignment)
		byte narrowbyte = (byte)123456; // 64
		
		System.out.println("Int: "+x);
		System.out.println("NarrowByte: "+narrowbyte);
		
		//Truncation
		//Explicit
		int iTruncate = (int)0.99;
		System.out.println("iTruncated: "+iTruncate);
		
		//Implicit (int to long)
		y=x;
		System.out.println("Long: "+y);
		
		//Implicit (char to int)
		char eChar = 'A';
		int iInt = (char) eChar;
		System.out.println("iInt: "+iInt);
		
		//byte to char using Explicit 
		byte bByte = 66;
		eChar = (char) bByte;//(Special conversion widely from byte to int byte --> int and narrowing from int to char int --> char)
		System.out.println("Char: "+eChar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typecasting();
	}

}
