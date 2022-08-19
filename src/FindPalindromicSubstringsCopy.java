import java.util.HashSet;
import java.util.Set;
 
class FindPalindromicSubstringsCopy
{

	static void findPalindromicSubstrings(String str) {
		
		Set<String> set=new HashSet<String>();
		if(str.length()==0) {
			return;
		}
		for(int i=0;i<str.length();i++) {
			expand(i,i,str,set);
			expand(i,i+1,str,set);
		}
		System.out.println(set.toString());
	}
	
	static void expand(int low, int high, String str, Set<String> set) {
		while(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high)) {
			set.add(str.substring(low, high+1));
			low--;
			high++;
		}
	
	}
 
    public static void main(String[] args)
    {
        String str = "google";
 
        findPalindromicSubstrings(str);
    }
}
