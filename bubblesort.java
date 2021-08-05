package src.Array.SortingAlgos;

public class bubblesort {

	public static void main(String[] args) {

		
		int[] intArray =  {7, -11, 35, -25, 18, 55, 2};
		
		for(int lastIndex = intArray.length-1 ;  lastIndex > 0 ; lastIndex -- ) 
		{
			for(int i = 0; i < lastIndex; i++)
			{
				if(intArray[i] > intArray[i+1])
				{
					swap(intArray, i, i+1);
				}
			}
		}
		
		
		int[] intArray1 =  {7, -11, 35, -25, 18, 55, 2}; 
		for(int firstIndex = 0; firstIndex < intArray1.length -1; firstIndex ++)
		{
			for(int i = intArray1.length -1; i > firstIndex; i-- )
			{
				if (intArray1[i] > intArray1[i-1])
				{
					swap_desc(intArray1, i, i-1);
				}
			}
		}
		
		
		for(int i = 0; i < intArray1.length; i++)
		{
			System.out.println(intArray1[i]);
		}
		
		

	}
	
	public static void swap(int[] intArray, int i, int j) 
	{
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}
	public static void swap_desc(int[] intArray1, int i, int j) 
	{
		int temp = intArray1[i];
		intArray1[i] = intArray1[j];
		intArray1[j] = temp;
	}
}
