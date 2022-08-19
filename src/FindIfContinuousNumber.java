
public class FindIfContinuousNumber {

	public static void main(String[] args) {
		String input="8910";
		Boolean result=findIfContinuousNumber(input);
		System.out.println(result);

	}

	static Boolean findIfContinuousNumber(String input) {
		
		int length=input.length();
		for(int i=0;i<length/2;i++) {
			String newStr=input.substring(0, i+1);
			int num=Integer.parseInt(newStr);
			while(newStr.length()<length) {
				num++;
				newStr=newStr+String.valueOf(num);
				
			}
			if(newStr.equals(input)) {
				return true;
			}
		}
		return false;
	}

}
