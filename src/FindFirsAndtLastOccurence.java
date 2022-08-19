import java.util.Arrays;

public class FindFirsAndtLastOccurence {

	public static void main(String[] args) {
		int []arr= {3, 2, 3, 3, 6, 6};
		Arrays.sort(arr);
		int first=first(arr,3);
		int last=last(arr,3);
		System.out.println("first"+first+"last"+last);

	}
	static int first(int[] arr, int n) {
		int start=0;
		int end=arr.length-1;
		int res=-1;
		while(start<=end) {
			int middle=start+(end-start)/2;
			if(arr[middle]==n) {
				res=middle;
				end=middle-1;
			}else if(arr[middle]<n) {
				start=middle+1;
			}else {
				end=middle-1;
			}
		}
		return res;
	}
	static int last(int[] arr, int n) {
		int start=0;
		int end=arr.length-1;
		int res=-1;
		while(start<=end) {
			int middle=start+(end-start)/2;
			if(arr[middle]==n) {
				res=middle;
				start=middle+1;
			}else if(arr[middle]<n) {
				start=middle+1;
			}else {
				end=middle-1;
			}
		}
		return res;
	}
	

}
