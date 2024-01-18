package ders5.iki;

public class MainClass12 {

	public static void main(String[] args) {
		Book b1 = new Book("James","java se",222,"java desc",2);
	  
		Book b2 = new Book("Aygun","jhghava se",222,"java desc",2);
		

		System.out.println(b1.name);
		System.out.println(b1.author);
		System.out.println(b1.pageCount);
		System.out.println(b1.description);
		System.out.println(b1.id);

	}
}
