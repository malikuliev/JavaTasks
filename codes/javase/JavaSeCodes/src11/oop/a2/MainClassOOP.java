package oop.a2;

public class MainClassOOP {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();

		Animal[] animals = { cat, dog };
		simpleMethod(animals);

	}

	public static void simpleMethod(Animal[] animals) {
		for (Animal animal : animals) {
			animal.eat();
		}
	}
}
