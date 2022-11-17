package sorting;

public class quickSort {

	static void swap(int[] arr, int si, int ei) {
		int temp = arr[si];
		arr[si] = arr[ei];
		arr[ei] = temp;
	}
	
	static int partition(int[] arr, int si, int ei) {
		
		int pivot = arr[ei];
		
		int i =  si - 1;
		
		for(int j = si; j < ei; j++) {
			
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
			
		}
		swap(arr, i + 1, ei);
		return i + 1;
	}
	
	static void QuickSort(int[] arr, int si, int ei) {
		
		if(si >= ei) return;
		
		int partitionIndex = partition(arr, si, ei);
		
		QuickSort(arr, si, partitionIndex - 1);
		QuickSort(arr, partitionIndex + 1, ei);
		
	}
	
	public static void main(String[] args) {

		int[] arr = {12, 32, 1, 32, 44, 2, 0};
		QuickSort(arr, 0, arr.length - 1);
		for(int i : arr) 
			System.out.print(i + " ");
	}

}
