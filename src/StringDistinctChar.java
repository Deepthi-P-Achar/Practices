
public class StringDistinctChar {

	public static void main(String[] args) {
		String str="hello";
		long count=str.chars().filter(c->c=='o').count();
		System.out.println(count);

	}

}
