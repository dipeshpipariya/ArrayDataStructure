package src.Array.SortingAlgos;

public class QuickSort {

	public static void main(String[] args) {
		int[] intArray =  {55, 7, -11, 35, -25, 18, 2};
		
		quickSort1(intArray, 0, intArray.length);
		
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}

	}
	
	public static void quickSort1(int[] input, int start, int end) {
		if (end - start < 2)
		{
			return;
		}
		
		int pivotindex = partition(input, start, end);
		quickSort1(input, start, pivotindex);
		quickSort1(input, pivotindex+1, end);
	}
	
	public static int partition(int[] input, int start, int end) {
		
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while(i < j) {
			
			// Note: Empty body (We are checking pivot values & decrementing J)
			while(i < j && input[--j] >= pivot);
			if(i < j)
			{
				input[i] = input[j];
			}
			
			while(i < j && input[++i] <= pivot);
			if(i < j)
			{
				input[j] = input[i];
			}
			
		}
		
		input[j] = pivot;
		
		
		return j;
	}

}
