package ders6.metodlar;

public class MainClass {
	public static  void main(String[] args) {

		Bank access = new Bank();// balance=0  
		access.addMoney(100); // balance=100

		Product armud = new Product(10, "Quba armudu");
		Product alma = new Product(5, "Goycay almasi");

		System.out.println("balance = " + access.balance);

		Shopping bravo = new Shopping();
		bravo.shop(access, alma, 0.2);

	}
}
