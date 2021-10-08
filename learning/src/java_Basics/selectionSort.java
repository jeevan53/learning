package java_Basics;

public class selectionSort {

	public static void main(String []args) {
	    int[] intArray = {22, 37 , -14, 5, 60, -22};
	    
	    
	    
	    for(int unSortedIndex =intArray.length - 1;unSortedIndex>0;unSortedIndex--)
	    {
	    	int largest = 0;
	    	for(int i=1;i<=unSortedIndex;i++)
	    	{
	    		if(intArray[i]>intArray[largest]) {
	    			largest = i;
	    		}
	    	}
	    	swap(intArray,largest,unSortedIndex);
	    }
	    System.out.println("Sorted Array using Selection Sort is");
		for(int i = 0;i<intArray.length;i++) {
			
			System.out.printf("%d ", intArray[i]);
		}
	}
		
		public static void swap(int[] array, int i, int j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		
	}
}
