package com.lams1989.hk;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] paresder = new String[t];
		String[] paresizq = new String[t];
		for (int i = 0; i < t; i++) {
			paresder[i] = s.next();
			paresizq[i] = s.next();
		}
		Set<String> pares = new HashSet<String>(t);
		int count = 0;
		for (int i = 0; i < t; i++) {
			boolean b = pares.add(paresder[i] + " " + paresizq[i]);
			if (b)
				count++;
			System.out.println(count);
		}
		s.close();
	}
}
