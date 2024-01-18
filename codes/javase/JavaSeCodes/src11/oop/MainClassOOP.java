package oop;

import oop.a2.Animal;
import oop.another.Developer;

public class MainClassOOP {
	public static void main(String[] args) {
		// Person p1=new Person("Adil","Aliyev");
		// p1.printInfo();

		// Developer d1 = new Developer();
		// Alt sinifin obyektini üst sinifin referensinə mənimsətmək mümkündür.

		Animal p1 = new Developer();
		simpleMethod(p1);
		

	}

	public static void simpleMethod(Animal p) {
		 
	}
}
