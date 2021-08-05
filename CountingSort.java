package src.Array.SortingAlgos;

public class CountingSort {

	
	// Assume data type -It should be positive & should be in some rage
	// The data range (1-1000) & actual array length should be close to each other
	//(as if range is 1-1000 & actual array is size of 10 elements then unnecessary we have to create array with 1000 element)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {101, 105, 104, 101, 102, 106, 101, 102};
		
		countSort(input, 101, 106);
		
		for (int i = 0; i < input.length; i++)
		{
			System.out.println(input[i]);
			}

	}
	
	public static void countSort(int[] input, int min, int max)
	{
		// Defining array with size of range (here - (106-101) + 1 = 6)
		int[] countArray = new int[(max - min) + 1];
		
		
		// incrementing count by 1 by 1 when occurance of the element is present - output of below will be
		// {3,2,0,1,1} - (3 times 101, 2 time 102, 0 time 103, and so on)
		for(int i = 0; i < input.length; i++)
		{
			countArray[input[i] - min]++;
		}
		
		// iterating array by min & max value so we can easily replace the postion with values of range
		// 101 it will added at first 3 postion & 102 will added after that & so on
		int j = 0;
		for (int i = min; i <= max; i++)
		{
			// here, we are trying to check if the element with in range is falgged & present
			// countArray[i - min] == countArray[101-101] ==> countArray[0] > 0 --> yes its is 
			//so update first element with 101 & reduce counter value by 1
			while(countArray[i - min] > 0)
			{
				// replacing the values to original array
				input[j++] = i;
				// decrementing the count of same element occurance
				countArray[i - min]--; 
			}
		}
		
		
	}

}
