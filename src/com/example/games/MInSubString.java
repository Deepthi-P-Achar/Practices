package com.example.games;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MInSubString {

	public static void main(String[] args) {
		// Given two string
		String a = "QQQQQABCDEFGHIJDIVKLMNOPQRSTUVWXYZOOOABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int len = minLength(a, b);
		if (len != Integer.MAX_VALUE) {
			System.out.println(len);
		} else {
			System.out.println("Impossible");
		}

	}

	private static int minLength(String a, String b) {
		Set<Character> ch = new HashSet();
		HashMap<Character, ArrayList<Integer>> charIndex = new HashMap<Character, ArrayList<Integer>>();
		for (int i = 0; i < b.length(); i++) {
			ch.add(b.charAt(i));
		}
		for (int j = 0; j < a.length(); j++) {
			char x = a.charAt(j);
			if (ch.contains(x)) {
				if (charIndex.get(x) == null) {
					ArrayList<Integer> list = new ArrayList<Integer>();
					charIndex.put(x, list);
				}
				charIndex.get(x).add(j);
			}
		}
		int len = Integer.MAX_VALUE;
		int flag;
		while (true) {
			flag = 1;
			int firstChar = 0;
			int lastChar = 0;
			for (int k = 0; k < b.length(); k++) {
				if (k == 0) {
					if (charIndex.get(b.charAt(k)).isEmpty()) {
						flag = 0;
						break;
					} else {
						firstChar = charIndex.get(b.charAt(k)).get(0);
						charIndex.get(b.charAt(k)).remove(Integer.valueOf(firstChar));
						lastChar = firstChar;
					}
				} else {
					int elementFound = 0;
					for (int e : charIndex.get(b.charAt(k))) {
						if (e > lastChar) {
							lastChar = e;
							elementFound = 1;
							break;
						}
					}
					if (elementFound == 0) {
						flag = 0;
						break;
					}

				}

			}
			if (flag == 0) {
				break;
			}
			len = Math.min(len, lastChar - firstChar + 1);

		}

		return len;
	}

}
