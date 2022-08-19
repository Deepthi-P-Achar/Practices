
public class FindWordWithMaxEvenLength {

	public static void main(String[] args) {
	String str="Be not afraid of greatness, some are born great, some achieve greatness, and some have greatness thrust upon them.";
	String evenWord="";
	String []words=str.split(" ");
	for(String word:words) {
		if(word.length()%2==0) {
			if(word.length()>evenWord.length()) {
				evenWord=word;
			}
		}
	}
System.out.println(evenWord);
	}

}
