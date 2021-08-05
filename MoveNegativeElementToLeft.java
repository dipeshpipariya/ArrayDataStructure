package src.Array.SortingAlgos;

public class MoveNegativeElementToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray =  {55, 7, -11, 35, -25, 18, 2};
//		moveNegative(intArray);
//		moveNegartiveBetter(intArray);
		moveNegartiveBest(intArray);
		for(int i = 0; i < intArray.length; i ++)
		{
			System.out.println(intArray[i]);
		}

	}
	
	// We have to use extra space here, 
	public static void moveNegative(int[] input)
	{
		int i = 0;
		int j = input.length-1;
		System.out.println("Length of J" + j);
		int[] temp = new int[j+1];
		System.out.println("Length of temp" + temp.length);
		
		for(int a = 0; a < input.length; a++)
		{
			if(input[a] < 0)
			{
				temp[i] = input[a];
				i++;
			}
			else 
			{
				temp[j] = input[a];
				j--;
			}
		}
		System.arraycopy(temp, 0, input, 0,input.length );
		
	}
	
	// here, we dont have to use any extra array -Just keeping track of J & swapping element with J 
	public static void moveNegartiveBetter(int[] input)
	{
		
		int j = 0, temp;
		for(int i = 0; i < input.length; i++)
		{
			if(input[i] < 0)
			{
				if(i != j)
				{
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
				j++;
			}
		}
		
		
	}
	
	public static void moveNegartiveBest(int[] input)
	{
		int left = 0;
		int right = input.length-1;
		int temp;
		
		while(left <= right)
		{
			// check if left & right both negative (only increment left as we want to move all negative to left)
			if(input[left] < 0 && input[right] <0)
			{
				left++;
			}
			// check left is postive & right is negative
			// Swap both (as all negative needs to be on right)
			else if(input[left] > 0 && input[right] < 0)
			{
				temp = input[left];
				input[left] = input[right];
				input[right] = temp;
				right--;
				left++;
			}
			// Condition to check if both the
	        // elements are positive
	        else if (input[left] > 0 && input[right] > 0)
	        {
	            right--;
	        }
	        else
	        {
	        	left++;
	        	right--;
	        }
		}
		
		
	}

}
