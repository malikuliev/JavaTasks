package ders9;

import java.util.Arrays;

public class Main9 {
	public static void main(String[] args) {

		sum(2, 5);
		sum(2, 5, 8);
		sum(2, 5, 8, 9, 65, 5435, 534);

	}

	static void sum(int... array) {

		int s = 0;
		for (int a : array) {
			s += a;
		}
		System.out.println(s);

	}

}
