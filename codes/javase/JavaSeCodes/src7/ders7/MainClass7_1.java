package ders7;

import java.util.Scanner;

public class MainClass7_1 {

	public static void main(String[] args) {

		Money bosh = new Money();
		System.out.println(bosh.balance);
		bosh.balance = 100;
		bosh.currency="USD";
		System.out.println(bosh.balance);
		int a=3; // local var
		System.out.println(a);

		System.out.println(Money.count);
	}

}
