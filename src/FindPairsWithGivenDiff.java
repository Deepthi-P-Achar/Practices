import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindPairsWithGivenDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={5, 20, 3, 2, 50, 80};
		int n=78;
		int []result=findPairsWithGivenDiff(arr, n);
		for(int i=0;i<2;i++) {
		System.out.println(result[i]);
		}
		
	}
	static int[] findPairsWithGivenDiff(int []arr, int n) {
		Set <Integer>set=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i]-n)) {
				return new int[] {arr[i]-n, arr[i]};
			}else if(set.contains(arr[i]+n)) {
				return new int[] {arr[i]+n, arr[i]};
			}
			set.add(arr[i]);
		}
		return new int[] {};
	}

}
