package sortingAlgorithms;

public class bubbleSort {
	  public static void main(String []args){
	        int[] intArray = {22, 37 , -14, 5, 60, -22};
	        
	        for(int unSortedIndex = intArray.length - 1; unSortedIndex>0;unSortedIndex--) {
	        	for(int i=0;i<unSortedIndex;i++) {
	        		if(intArray[i]>intArray[i+1])
	        		{
	        			swap(intArray,i,i+1);
	        		}
	        	}
	        }
	        System.out.println("Sorted Array using Bubble Sort is");
	        for(int i=0; i<intArray.length; i++)
	        {
	        	
	            System.out.printf("%d ",intArray[i]);
	        }
	  }
	        
	        public static void swap(int[] array,int i,int j) {
	        	if(i == j)
	        	{
	        		return;
	        	}
	        		int temp = array[i];
	        		array[i] = array[j];
	        		array[j] = temp;
	        }
	        
	     
}
