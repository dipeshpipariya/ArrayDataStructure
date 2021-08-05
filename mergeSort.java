package src.Array.SortingAlgos;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray =  {55, 7, -11, 35, -25, 18, 2};
		devideMethod(intArray, 0, intArray.length);
		
		for(int i = 0; i < intArray.length; i ++)
		{
			System.out.println(intArray[i]);
		}

	}

	public static void devideMethod(int[] input, int start, int end)
	{
		if(end - start < 2)
		{
			return;
		}
		
		int mid = (end + start)/2;
		
		devideMethod(input, start, mid);
		devideMethod(input, mid, end);
		merge(input, start, mid, end);
	}
	
	public static void merge(int[] input, int start, int mid, int end)
	{
		if (input[mid-1] <= input[mid])
		{
			return;
		}

		
		int i = start;
		int j = mid; 
		int[] temp = new int[end - start];
		int tempIndex = 0;
		
		while(i < mid && j < end)
		{
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		
		// handle the left out element from left array
		while(i < mid)
		{
			temp[tempIndex++] = input[i];
			i++;
		}
		//handle the left out element from right array
		while(j < end)
		{
			temp[tempIndex++] = input[j];
			j++;
		}
		
		// Copy the output to final array
		System.arraycopy(temp, 0, input, start, temp.length );
		
	}
	
}
