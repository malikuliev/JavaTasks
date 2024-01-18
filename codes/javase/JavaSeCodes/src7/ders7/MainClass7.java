package ders7;

import java.util.Scanner;

public class MainClass7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("adinizi yazin : ");
		String name = s.nextLine();

		s.close();
		System.out.println("salam : " + name);
	}

}
