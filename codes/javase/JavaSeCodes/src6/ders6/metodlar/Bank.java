package ders6.metodlar;

public class Bank {
	double balance;

	void drawMoney(double amount) {
		this.balance -= amount;
	}

	void addMoney(double amount) {
		this.balance += amount;
	}
}
