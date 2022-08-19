import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N;
		try {
			N = sc.nextInt();
		
        int []arr=new int[N];
        for(int i=0;i<N;i++) {
        	arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int l=0;
        int r=0;
        for(int j=0;j<q;j++) {
         l=sc.nextInt();
         r=sc.nextInt();
         findMedianOfSubArray(l, r, arr);
        }
       
       
		}catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
        

	}

	private static void findMedianOfSubArray(int l, int r, int[] arr) {
		int []subArray= new int[r-l+1];
		subArray=Arrays.copyOfRange(arr, l-1, r);
		Arrays.sort(subArray);
		int middle;
		int length=subArray.length;
		if(length % 2==0) {
			middle=(length/2)-1;
		}else {
			middle=length/2;
		}
		System.out.println(subArray[middle]);
		
	}

}
