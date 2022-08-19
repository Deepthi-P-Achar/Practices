import java.util.Arrays;

public class TwoStrings {

	public static void main(String[] args) {
		String []a={"ab","cd", "ef"};
		String []b={"fa", "ee", "ef"};
		isThereCommonString(a,b);

	}

	private static void isThereCommonString(String[] a, String[] b) {
		if(a.length!=b.length) {
			return;
		}
		boolean []present=new boolean[26];
		for(int i=0;i<a.length;i++) {
			String str1=a[i];
			String str2=b[i];
			Arrays.fill(present, false);
			for(char ch1: str1.toCharArray()) {
				present[ch1-'a']=true;
			}
			int counter=0;
			for(char ch2:str2.toCharArray()) {
				if(present[ch2-'a']){
					System.out.println("YES");
					break;
				}else if(counter==str1.length()-1){
					System.out.println("NO");
					break;
				}
				counter++;
			}
			
		}
		
	}

}
