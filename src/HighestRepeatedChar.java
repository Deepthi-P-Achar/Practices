import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public class HighestRepeatedChar {

	public static void main(String[] args) {
		String str="1231231234234324deepthideepthideepthideepthideepthideepthideepthi1231231231313131311111111111111222222222222";
		findRepeatedChar(str);

	}
	static void findRepeatedChar(String str) {
		HashMap <Character, Integer>map= new HashMap<Character, Integer>();
		int max=Integer.MIN_VALUE;
		char []charArray=str.toCharArray();
		for(char c:charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
			
		}
		int maxCharCount=Collections.max(map.values());
		char maxCharValue=Character.MAX_VALUE;
		for(Entry <Character, Integer>entry: map.entrySet()){
			if(entry.getValue()==maxCharCount) {
				maxCharValue=entry.getKey();
				System.out.println("key "+ maxCharValue +"value "+ maxCharCount);
			}
		}
		Map<Character, Integer> result = map.entrySet()
				  .stream()
				  .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				  .collect(Collectors.toMap(
				    Map.Entry::getKey, 
				    Map.Entry::getValue, 
				    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
	}

}
