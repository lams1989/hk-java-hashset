package com.lams1989.hk;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];
		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		Set<String> pairs = new HashSet<String>(t);
		int count = 0;
		for (int i = 0; i < t; i++) {
			boolean b = pairs.add(pair_left[i] + " " + pair_right[i]);
			if (b)
				count++;
			System.out.println(count);
		}
		s.close();
	}
}
