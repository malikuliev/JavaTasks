package ders9.string;

public class MainString {
	public static void main(String[] args) {

		String a =  " Alma";
		String b = " Alma";

		System.out.println(a == b);

		Person p1 = new Person();
		p1.name="Ayxan";
		Person p2 = new Person();
		p2.name="Ayxan";

		boolean p1EqP2 = p1 == p2;
		System.out.println(p1EqP2);
	}
}
