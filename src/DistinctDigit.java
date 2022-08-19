import java.util.Arrays;

public class DistinctDigit {

	public static void main(String[] args) {
		int n=1;
		int m=100;
		int result=countOfNoWithNoRepetingDigits(n,m);
		System.out.println(result);

	}

	private static int countOfNoWithNoRepetingDigits(int n, int m) {
		if(n>m) {
			return 0;
		}
		int count=0;
		for(int i=n;i<=m;i++) {
			int num=i;
			
			boolean []seen=new boolean[10];
			Arrays.fill(seen, false);
			while(num!=0) {
				if(seen[num%10]) {
					break;
				}
				seen[num%10]=true;
				num=num/10;
				
			}
			if(num==0) {
				System.out.println(i);
				count++;
			}
		}
		return count;
		
		
	}

}
