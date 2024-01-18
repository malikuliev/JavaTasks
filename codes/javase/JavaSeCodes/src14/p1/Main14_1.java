package p1;

public class Main14_1 {

	public static void main(String[] args) {

		int[] numbers = { 3, 7, 2 };

		int a = 0;
		try {
			a = numbers[10];
		} catch (SalehinExceptionSinifi e) {
			System.out.println(e.getMessage());
		}

		System.out.println(a);

	}

}
