package main;

public class Operatorlar4 {

	public static void main(String[] args) {

		int a = 4;
		int b = 8;
		int c = ++a - --b % b-- * a;
		System.out.println(c);
		System.out.println(b);

	}

}
