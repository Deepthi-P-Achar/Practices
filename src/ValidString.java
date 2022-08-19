import java.util.Stack;

public class ValidString {

	public static void main(String[] args) {
		String input="{[]()}";
		boolean result=isValidString(input);
		System.out.println(result);
	}
	static boolean  isValidString(String input) {
		Stack<Character> stack=new Stack<Character>();
		for(Character c: input.toCharArray()) {
			switch(c) {
			case '}':
				if(!stack.isEmpty() && stack.peek() =='{') {
					stack.pop();
				}else {
					stack.push(c);
				}
				break;
			case ']':
				if(!stack.isEmpty() && stack.peek() =='[') {
					stack.pop();
				}else {
					stack.push(c);
				}
				break;
			case ')':
				if(!stack.isEmpty() && stack.peek() =='(') {
					stack.pop();
				}else {
					stack.push(c);
				}
				break;
				default:
					stack.push(c);
					break;
			}
		}
		return stack.isEmpty();
	}

}
