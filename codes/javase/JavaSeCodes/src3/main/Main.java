package main;

public class Main {

	public static void main(String[] args) {

		byte b = 100;// 0000 0000
		int i = b; // 0000 0000 x 4
		short l = -140;

		short s = l;// 16
		byte k = (byte) s; // 8 // overflow
		System.out.println(k);
		char c= 65;
		System.out.println(c);

	}

}
