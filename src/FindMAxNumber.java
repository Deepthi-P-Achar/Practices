
public class FindMAxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {-1, -1, -1, -1, -1, -1, -1, -1, -1};
		int result=findSecondMax(arr);
		System.out.println(result);
		

	}
	static int findSecondMax(int []input) {
		int maxOne=Integer.MIN_VALUE;
		int maxTwo=Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++) {
			if(input[i]>maxOne) {
				maxTwo=maxOne;
				maxOne=input[i];
			}else if(input[i]>maxTwo && input[i]!=maxOne) {
				maxTwo=input[i];
			}
		}
		return maxTwo;
	}

}
