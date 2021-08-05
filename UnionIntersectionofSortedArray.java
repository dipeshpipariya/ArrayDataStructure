package src.Array.SortingAlgos;

public class UnionIntersectionofSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {1,2,3};
		int[] input2 = {3,4,5};
		
		int[] union = union(input1, input2);
		int[] intersection = intersaction(input1, input2);
		
		for(int i = 0; i < union.length; i++)
		{
			System.out.println("union ==>" + union[i]);
		}
		for(int i = 0; i < intersection.length; i++)
		{
			System.out.println("intersection ==>" + intersection[i]);
		}
		

	}
	
	public static int[] union(int[] input1, int[] input2)
	{
		int left = 0;
		int right = 0;
		int[] temp = new int[input1.length + input2.length];
		int tempIndex = 0;
		
		while(left <input1.length && right < input2.length )
		{
			if (input1[left] < input2[right])
			{
				temp[tempIndex++] = input1[left];
				left ++;
			}
			else if(left > input1.length && right < input2.length)
			{
				temp[tempIndex++] = input2[right];
				right ++;
			}
			else if(input1[left] == input2[right])
			{
				temp[tempIndex++] = input2[right];
				right ++;
				left++;
			}
		}
		while(left <input1.length)
		{
			temp[tempIndex++] = input1[left];
			left ++;
		}
		
		while(right <input2.length)
		{
			temp[tempIndex++] = input2[right];
			right ++;
		}
		
		return temp;
	}
	
	
	public static int[] intersaction(int[] input1, int[] input2)
	{
		int left = 0;
		int right = 0;
		int[] temp = new int[input1.length + input2.length];
		int tempIndex = 0;
		
		while(left < input1.length && right < input2.length )
		{
			if (input1[left] < input2[right])
			{
//				temp[tempIndex++] = input1[left];
				left ++;
			}
			else if(left > input1.length && right < input2.length)
			{
//				temp[tempIndex++] = input2[right];
				right ++;
			}
			else if(input1[left] == input2[right])
			{
				temp[tempIndex++] = input2[right];
				right ++;
				left++;
			}
		}
		return temp;
		
		
	}

}
