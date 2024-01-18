package ders5;

public class MainClass {

	public static void main(String[] args) {

		// int a=9;
		// System.out.println(a);
		Car kia = new Car();
		// primitive 8
		// referense
		kia.price = 10000;
		kia.color = "red";
		kia.model = "rio";

		int a = 7;
		int b = a;
		b = 30;
		System.out.println(a);

		Car kia2 = kia;
		kia2.price = 2000;
		System.out.println(kia.price);

	}

}
