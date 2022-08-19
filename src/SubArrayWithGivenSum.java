
public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int []arr={1, 2, 3, 4, 5, 6, 7, 8,9};
		
		
		checkifSubArrayWithGivenSumExists(arr, 5);

	}
	static boolean checkifSubArrayWithGivenSumExists(int[] arr, int sum) {
		int curr_sum=arr[0];
		int start=0;
		for(int i=1;i<arr.length;i++) {
			if(curr_sum>sum && start< arr.length) {
				curr_sum=curr_sum-arr[start];
				start++;
			}
			if(curr_sum==sum) {
				int p=i-1;
				System.out.println("between"+start +"and"+p);
				return true;
			}
			if(i<arr.length) {
				curr_sum=curr_sum+arr[i];
			}
			
		}
		return false;
		
	}

}
