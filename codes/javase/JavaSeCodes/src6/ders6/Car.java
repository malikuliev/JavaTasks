package ders6;

public class Car {

	String model;
	String color;
	int price;

	public Car(int a) {
		System.out.println(a);
		
		this.price = a;
		System.out.println("Car int olan");
	}

	public Car() {
		System.out.println("Car def olan");
	}

}
