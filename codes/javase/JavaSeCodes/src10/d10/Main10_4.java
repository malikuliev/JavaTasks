package d10;

public class Main10_4 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder(10000);

		for (int i = 1; i <= 1_000_000; i++) { // 800 000 000
			s.append("Java");
		}
		System.out.println("end");

	}

}
