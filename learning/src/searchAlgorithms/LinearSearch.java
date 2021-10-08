package searchAlgorithms;

public class LinearSearch {

	public static int searchElement(int[] array,int value) {
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==value) {
				return i;
			}
		}
		return -1;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {20,35,-15,7,55,1,-22};
		int result = searchElement(A,55);
		int x = 55;
		if(result == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element "+x+" found at position: "+(result+1));
		}	
	}
}
