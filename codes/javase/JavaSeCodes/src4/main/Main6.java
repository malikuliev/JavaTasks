package main;

public class Main6 {

	public static void main(String[] args) {
		boolean hasCar = true;
		boolean hasHome = true;
		int a = 10;

		// eger her ikiside olarsa ise qbul et
		if (hasCar && a++ == 10) {
			System.out.println("olar");
		} else {
			System.out.println("olmaz");
		}

		System.out.println(a);
	}

}
