package ders5.iki;

public class Book {
	String name;
	String author;
	String description;
	int pageCount;
	int id;

	public Book(String author,String name,int pageCount,String d,int id) {
		this.author=author;
		this.name=name;
		this.pageCount=pageCount;
		this.description=d;
		this.id=id;
		
		
		System.out.println("Book obyekti yarandi");
		// mail at
		// mudure mail at
	}
}
