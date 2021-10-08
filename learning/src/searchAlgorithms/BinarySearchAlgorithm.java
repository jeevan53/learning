package searchAlgorithms;

public class BinarySearchAlgorithm {
	int searchElement(int[] array,int left,int right,int value) {
		if(left <= right) {
			
			int mid = (left+right)/2;
			
			if(array[mid]==value) {
				return mid;
			}
			else if(array[mid]>value)
				return searchElement(array,left,mid-1,value);
			else
			{
				return searchElement(array,mid+1,right,value);
			}
		}
		return -1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchAlgorithm obj = new BinarySearchAlgorithm();
		int[] B = {2,3,4,10,20,40};
		int result = obj.searchElement(B, 0, B.length-1, 20);
		
		if(result == -1) {
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("ELement found at position : "+result);
		}
	}

}
