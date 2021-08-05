package src.Array.SortingAlgos;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { -2, -3, 4, -1, -2, 1, 5, -3 };
		maxSum(intArray);
//		System.out.println("max sum ==> " + max_sum);

	}

	public static void maxSum(int[] intArray) {

		int max_sum_so_far = 0, current_sum = 0;
		int start = 0, end = 0, s = 0;

		for (int i = 0; i < intArray.length; i++) {
			current_sum += intArray[i];

			if (current_sum < 0) {
				current_sum = 0;
				s++;
			}
			if (current_sum > max_sum_so_far) {
				max_sum_so_far = current_sum;
				start = s;
				end = i;
			}
		}

		System.out.println("max sum ==> " + max_sum_so_far);
		System.out.println("First index of SubArray ==> " + start);
		System.out.println("End index of sub appry  ==> " + end);

	}

}
