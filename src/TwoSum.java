import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, -3, 5, 6};
		int sum=2;
		boolean result=findTwoSum(arr, 11);
		System.out.println(result);
		

	}
	static boolean findTwoSum(int[] arr, int sum ) {
		Arrays.sort(arr);
		int first=0;
		int second=arr.length-1;
		while(first<second && first<arr.length) {
			int curr_sum=arr[first]+arr[second];
			if(curr_sum==sum) {
				return true;
			}
			else if(curr_sum>sum) {
				second--;
			}else {
				first++;
			}
			
		}
		return false;
		
	}

}
