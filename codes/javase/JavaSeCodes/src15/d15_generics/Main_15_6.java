package d15_generics;

import java.util.ArrayList;

public class Main_15_6 {

	public static void main(String[] args) {

		Siyahi<Integer> siyahim = new Siyahi(5, 3);

		siyahim.yenisi(12);
		siyahim.yenisi(25);
		siyahim.yenisi(31);
		siyahim.yenisi(36);
		System.out.println(siyahim.hamisiniQaytar());
		siyahim.silmek(3);
		System.out.println(siyahim.hamisiniQaytar());

	}

}
