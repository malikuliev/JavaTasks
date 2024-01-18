package yeni;

import java.util.Random;
import java.util.Scanner;

public class Main8_4 {

	public static void main(String[] args) {
		// 3 elementli String tipli massiv yarat
		// scanner ile massivin daxilini adlar ile doldur
		// massivin butun elementlerini for each ile konsola cap et

		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		String[] names = new String[5];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.println("" + (i + 1) + " ci adi yaz");
			names[i] = s.nextLine();
		}
		s.close();

		for (String name : names) {
		 
			System.out.println(name);
		}

	}

}
