import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	/*
	 * Complete the 'getHammingDistSum' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. STRING s 2. INTEGER k
	 */

	public static long getHammingDistSum(String s, int k) {
		long sum = 0;
		for (int i = 0; i < s.length(); i++) {
			String subString1 = s.substring(i, i + k);
			String subString2 = s.substring(i + 1, i + 1 + k);
			int result = getHammingDistance(subString1, subString2);
			sum += result;
		}
		return sum;
	}

	private static int getHammingDistance(String subString1, String subString2) {
		int i = 0;
		int distance = 0;
		while (i < subString1.length()) {
			if (subString1.charAt(i) != subString2.charAt(i)) {
				distance++;
			}
			i++;
		}
		return distance;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		int k = Integer.parseInt(bufferedReader.readLine().trim());

		long result = Result.getHammingDistSum(s, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
