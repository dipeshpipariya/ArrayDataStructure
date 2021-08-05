package src.Array.SortingAlgos;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1) Create last index – for sorting partition
//		2) Choose the first element as the largest value & compare it with next element
//		3) If next value is bigger than previous replace the variable value
//		4) Repeat steps 4 untill loop ends & swap biggest value with the last index

		
		int[] intArray = {7, -11, 35, -25, 18, 55,0, 2};
		for(int lastIndex = intArray.length -1; lastIndex > 0; lastIndex -- )
		{
			int biggest = 0;
			for(int i = 1; i <= lastIndex; i++)
			{
				if(intArray[biggest] < intArray[i])
				{
					biggest = i;
				}
			}
			swap(intArray, biggest, lastIndex);
		}
		for(int i = 0; i <intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}
		

	}
	
	public static void swap(int[] intArray, int i, int j)
	{
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;

	}

}
