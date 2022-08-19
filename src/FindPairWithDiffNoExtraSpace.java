import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindPairWithDiffNoExtraSpace {

	public static void main(String[] args) {
		int []arr={5, 20, 3, 2, 50, 80};
		int n=78;
		int []result=findPairsWithGivenDiff(arr, n);
		for(int i=0;i<2;i++) {
		System.out.println(result[i]);
		}
		
		

	}
	static int[] findPairsWithGivenDiff(int []arr, int n) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int index=binarySearch(i+1,arr.length-1,arr, arr[i]-n);
			if(index==-1) {
				index=binarySearch(i+1,arr.length-1,arr,arr[i]+n);
			}
			if(index!=-1) {
				return new int[]{arr[i],arr[index]};
			}
		}
	
		return new int[] {};
	}
	
	static int binarySearch(int start, int end, int[] arr, int target) {
		
		while(start<=end) {
			int middle=start+(end-start)/2;
			if(arr[middle]==target) {
				return middle;
			}else if(arr[middle]<target) {
				start=middle+1;
			}else {
				end=middle-1;
			}
		}
		
	
		return -1;
	}


}
