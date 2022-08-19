
public class FarthestFromZero {

	public static void main(String[] args) {
		int []arr= {-1, -9, -5, 6, 9,-9, 9, -10};
		int result=findFarthestFromZero(arr);
		System.out.println(result);

	}

	private static int findFarthestFromZero(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(Math.abs(arr[i])>Math.abs(max)) {
				max=arr[i];
			}else if(Math.abs(arr[i])==Math.abs(max) && arr[i]<max) {
				max=arr[i];
			}
		}
		return max;
		
	}

}
