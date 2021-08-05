package src.Array.SortingAlgos;

public class shellSortWithInsertionSort {
	
	public static void main(String[] args)
	{
		int[] intArray = {7, -11, 35, -25, 18, 55,0, 2};
		
		for(int gap = intArray.length/2; gap > 0; gap = gap/2) {
			
			for(int i = gap; i < intArray.length; i++)
			{
				int newElement = intArray[i]; // -25
				
				int j = i;
				
				while(j >= gap && intArray[j-gap] > newElement)
				{
					intArray[j] = intArray[j-gap];
					j -= gap;
				}
				
				intArray[j] = newElement;
			}
			
			
		}
		
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}
	}

}
