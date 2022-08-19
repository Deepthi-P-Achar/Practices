
public class AddOneToDigits {

	public static void main(String[] args) {
		int []input= {9,9,8};
		int []output=addOneToDigit(input);
		for(int i:output) {
		System.out.println(i);
		}

	}
	static int[] addOneToDigit(int[] input) {
		for(int i=input.length-1;i>=0;i--) {
			if(input[i]!=9) {
				input[i]++;
				break;
			}else {
				input[i]=0;
				if(i==0) {
					int[] newArr=new int[input.length+1];
					newArr[i]=1;
					return newArr;
				}
			}
		}
		
		return input;
	}

}
