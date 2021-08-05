package src.Array.SortingAlgos;
import java.util.Scanner;

public class palindropString_and_Count {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Array size");
		String s = in.nextLine();
		System.out.println("Enter size = " + s);
//		String name = reader.readLine();
		
		int count =Integer.parseInt(s);
		
		String[] input = new String[count];
		int inputIndex = 0;
		
		for(int i = 0; i < count; i ++)
		{
			System.out.println("Insert string for Array at postion " + i);
			String values = in.nextLine();
			input[inputIndex++] = values;
		}
		
		String querySize = in.nextLine();
		int querySize1 = Integer.parseInt(querySize);
		String[] query =  new String[querySize1];
		
		for(int i = 0; i < querySize1; i ++)
		{
			System.out.println("Enter Query String ==> ");
			String query1 = in.nextLine();
			query[i] = query1;
		}
		}

		
	public static Object[]  queryResult(String[] input, String[] query)
	{
		
		
		
		
		return new Object[]{input, query};
	}
	
	}

