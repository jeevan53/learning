package sortAlgorithmsGreeks;

public class InsertionSort {

	public static void insertionSort(int[] array)
	{
		for(int i=0;i<array.length;i++) {
		
			int newElement = array[i];
			int j;
			for(j = i;j>0&&array[j-1]>newElement;j--) {
				
					array[j] = array[j-1];
				
				
			}
			array[j] = newElement;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {4,3,2,10,12,1,5,6};
		insertionSort(A);
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]+" ");
		}
		
	}

}
