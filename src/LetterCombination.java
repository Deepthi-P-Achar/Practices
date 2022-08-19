import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LetterCombination {
    Map<Character, String> map;
    String digits;
    List<String> res;
    public List<String> letterCombinations(String digits) {
        
        this.digits = digits;
        this.map = new HashMap<>();
        res = new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backTracking(0, new StringBuilder());
        return res;
    }
    private void backTracking(int numIdx, StringBuilder sBuilder){
        if(numIdx == digits.length()){
            res.add(sBuilder.toString());
            return;
        }
        for(char c : map.get(digits.charAt(numIdx)).toCharArray()){
            sBuilder.append(c);
            backTracking(numIdx+1, sBuilder);
            sBuilder.deleteCharAt(sBuilder.length()-1);
        }
    }
    public static void main(String []args) {
    	LetterCombination lc=new LetterCombination();
    	 List<String> res=lc.letterCombinations("234");
    	 for(String rc:res) {
    		 System.out.println(rc);
    	 }
    }
}