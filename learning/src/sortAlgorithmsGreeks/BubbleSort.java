package sortAlgorithmsGreeks;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr,int n) {
		
		for(int i = 0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
	
		int[] array = {64,25,12,22,11};
		bubbleSort(array,array.length);
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
