import java.util.HashMap;

public class MaxLenZeroSumSub {
	
	static Integer findMaxLenZeroSumSub(int arr[]) {
	
		HashMap <Integer,Integer>hm=new HashMap<Integer,Integer>();
		int sum=0;
		int max_length=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==0) {
				max_length=i+1;
			}
			Integer prev_i=hm.get(sum);
			if(prev_i !=null) {
				max_length=Math.max(max_length, i-prev_i);
			}else {
			hm.put(sum, i);
			}
		}
		return max_length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 15, -2, 2, -8, 1, 7, -15, 23 };
		int max_length=findMaxLenZeroSumSub(arr);
		System.out.println(max_length);

	}

}
