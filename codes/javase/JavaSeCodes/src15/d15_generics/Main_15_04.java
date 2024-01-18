package d15_generics;

import java.util.ArrayList;

public class Main_15_04 {

	public static void main(String[] args) {

		Siyahi<Integer> siyahim = new Siyahi(5, 3);
		 

		siyahim.yenisi(12);
		siyahim.yenisi(25);
		siyahim.yenisi(31);
		siyahim.yenisi(36);
		 
		
		Siyahi<String> siyahim2 = new Siyahi(4, 10);
		siyahim2.yenisi("Alma");
		siyahim2.yenisi("Armud");
		siyahim2.yenisi("Nar");
		 
		String hamisi = siyahim.hamisiniQaytar();
		System.out.println(hamisi);

		  hamisi = siyahim2.hamisiniQaytar();
		System.out.println(hamisi);
		 
		  
		
	}

}
