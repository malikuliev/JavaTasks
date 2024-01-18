package d11;

import java.util.Random;

public class Main11_2 {

	public static void main(String[] args) {
		MyE e1 = MyE.C;
		int m = e1.getA();
		System.out.println(m);
	}

}

enum MyE {
	B(3), C(7);

	private int a;

	public int getA() {
		return a;
	}

	private MyE(int a) {
		this.a = a;
	}

}