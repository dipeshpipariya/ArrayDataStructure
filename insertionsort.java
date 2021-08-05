package src.Array.SortingAlgos;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {7, -11, 35, -25, 18, 55,0, 2};
		
		for(int unsortedIndex = 1; unsortedIndex < intArray.length; unsortedIndex ++)
		{
			int newElement = intArray[unsortedIndex]; // -11
			
			int i;
			
			for(i = unsortedIndex; i > 0 && intArray[i-1] > newElement; i--)
			{
				// please remember - left side will get the value from right sided variable...!!
				intArray[i] = intArray[i-1];
			}
			intArray[i] = newElement;
		}
		
		for(int a= 0; a < intArray.length;a++)
		{
			System.out.println(intArray[a]);
		}

	}

}
