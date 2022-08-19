import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		char[] str1="malayalam".toCharArray();
		char[] str2="yalamalam".toCharArray();
		boolean result=isAnagram(str1,str2);
		System.out.println(result);
	}
	
	static boolean isAnagram(char[] str1, char[] str2) {
		int n1=str1.length;
		int n2=str2.length;
		if(n1!=n2)
			return false;
		int size=259;
		int[] count=new int[size];
		 Arrays.fill(count, 0);
		 for(int i = 0; i < str1.length; i++)
		    {
		        count[str1[i]]++;
		        count[str2[i]]--;
		    }
		 for(int i = 0; i < str1.length; i++)
		    {
		        if(count[str1[i]]!=0) {
		        	return false;
		        }
		    }
		 return true;
	}

}
