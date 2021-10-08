package sortingAlgorithms;

public class insertionSort {

	public static void main(String []args) {
	    int[] intArray = {22, 37 , -14, 5, 60, -22};
	    
	    
	    
	    for(int firstSortedIndex = 1;firstSortedIndex<intArray.length;firstSortedIndex++)
	    {
	    	int newElement=intArray[firstSortedIndex];
	    	
	    	int i;
	    	
	    	for(i = firstSortedIndex;i>0 && intArray[i-1]>newElement;i--)
	    	{
	    		intArray[i] = intArray[i-1];
	    	}
	    	
	    	intArray[i] = newElement;
	    }
	    System.out.println("Sorted Array using Insertion Sort is");
		for(int i = 0;i<intArray.length;i++) {
			
			System.out.printf("%d ", intArray[i]);
		}
	}
		

}
