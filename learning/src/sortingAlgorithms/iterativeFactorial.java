package sortingAlgorithms;

public class iterativeFactorial {

	public static void main(String []args) {
		System.out.println(numFactorial(6));
		System.out.println(recursiveFactorial(5));
	}
	public static int numFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		int factorial =1;
		for(int i = 1;i<=num;i++) {
			factorial *= i;
		}
		return factorial;
	}
	public static int recursiveFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		return num*recursiveFactorial(num -1);
	}
}
