package ders5;

public class Main {

	public static void main(String[] args) {
		int i = 365650132;
		int min = 9;
		while (i > 0) {
			int qaliq = i % 10;
			if (qaliq < min) {
				min = qaliq;

			}

			i = i / 10;
		}
		System.out.println(min);
	}

}
