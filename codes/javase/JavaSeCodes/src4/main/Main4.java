package main;

public class Main4 {

	public static void main(String[] args) {

		int age = 19;

		System.out.println(age == 8);
		System.out.println(age != 8);

		System.out.println(6 + 9 > 15);
		System.out.println(6 + 9 >= 5);

		boolean canDrive = age >= 18;
		int yourMoney = 10;
		int minAmount = 20;
		// head first java

		if (canDrive) {
			if (yourMoney >= minAmount) {
				System.out.println("sene masin olar");
			} else {
				System.out.println("pulun catmir, min " + minAmount + " olmalidir");
			}

		} else {
			System.out.println("yasin catmir");
		}

	}

}
