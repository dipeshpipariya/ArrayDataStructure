package src.Array.SortingAlgos;

public class CyclicallyRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {1,2,3,4,5};
		
		int lastElement = intArray[intArray.length -1];
		
		for (int i = intArray.length-2 ; i >= 0; i--)
		{
			intArray[i+1] = intArray[i];
		}
		intArray[0] = lastElement;
		
		for (int i = 0; i < intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}

	}

}
