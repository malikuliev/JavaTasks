package yeni;

import java.util.Random;

public class Main8_3 {

	public static void main(String[] args) {
		Random r = new Random();

		// int number1 = r.nextInt(20) + 1; // 0,1,2,....,19
		// System.out.println(number1);
		// int number2 = r.nextInt(20) + 1;
		// int number3 = r.nextInt(20) + 1;

		// int sum = number1 + number2 + number3;
		// int avg = sum / 3;

		 
		int[] numbers = new int[3000];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(20) + 1;
		}
		
		// 0,2999
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
		 
	}

}
