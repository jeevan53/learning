package searchAlgorithms;

public class LinearSearchOptimized {
	
	public static void searchElement(int[] array,int value) {
		int left = 0;
		int right = array.length - 1;
		int position = -1;
		for(;left<=right;) {
			if(array[left]==value) {
				position = left;
				System.out.println("Element "+value+" found at position: "+(position+1));
				break;
			}
				left++;
			if(array[right]==value) {
				position = right;
				System.out.println("Element "+value+" found at position: "+(position+1));
				break;
			}
		
				right--;
		}
		if(position == -1) {
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		int[] B = {22, 21, 45, 15, -3,1,-22};
		searchElement(B, 34);
		searchElement(B,22);
		searchElement(B,1);
	}

}
