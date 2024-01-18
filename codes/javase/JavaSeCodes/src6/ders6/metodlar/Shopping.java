package ders6.metodlar;

public class Shopping {

	void shop(Bank bank, Product p, double quantity) {
 
		double total = p.price * quantity; // 1
		bank.drawMoney(total);
		System.out.println("alinan mehsul = " + p.name);
		System.out.println("miqdari = " + quantity);
		System.out.println("bankda qalan qaliq : " + bank.balance);

	}
}
