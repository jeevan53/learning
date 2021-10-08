package sortAlgorithmsGreeks;

public class ShellSort {
	public static void shellSort(int[] array) {
		for(int gap = array.length/2;gap>0;gap/=2) {
			for(int i =gap;i<array.length;i++) {
				int newElement = array[i];
				int j=i;
				while(j>=gap&&array[j-gap]>newElement) {
					
						array[j] = array[j-gap];
						j-=gap;
				}
				array[j] = newElement;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] B = {4,3,2,10,12,1,5,6};
		shellSort(B);
		for(int i =0;i<B.length;i++) {
			System.out.println(B[i]+" ");
		}
	}

}
