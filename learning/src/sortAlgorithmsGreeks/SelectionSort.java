package sortAlgorithmsGreeks;

public class SelectionSort {
	
	public static void selectionSort(int[] arr, int n) {
		for(int i =0;i<n-1;i++) {
			int min =i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i]= temp;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {64,25,12,22,11};
		selectionSort(array,array.length);
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
