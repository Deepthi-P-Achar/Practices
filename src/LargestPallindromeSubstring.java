

import java.util.HashSet;

public class LargestPallindromeSubstring {
	
	public static void main(String[] args) {
		findLargestPallindromeSubstring("google");
		
		
	}
	
	static void findLargestPallindromeSubstring(String str) {
		HashSet<String> set=new HashSet<String>();
		if(str.length()<1) {
			return;
		}
		for(int i=0;i<str.length();i++) {
			expand(i,i,str,set);
			expand(i,i+1,str,set);
		}
		
		System.out.println(set.toString());
	}
	
	static void expand(int low, int high, String str, HashSet<String> set) {
		while(low>=0 && high<str.length() && str.charAt(high)==str.charAt(low)) {
			set.add(str.substring(low, high+1));
			low--;
			high++;
		}
		
	}

}
