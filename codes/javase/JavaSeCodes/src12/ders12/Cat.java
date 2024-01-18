package ders12;

public class Cat extends Animal {


	private String color;
	private String gender;

	public Cat(String name, int bithday, double weight, String color, String gender) {
		super(name, bithday, weight);  
		this.color = color;
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	 
}
