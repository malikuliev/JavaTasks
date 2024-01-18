package p21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_21 {

	public static void main(String[] args) {
		 
		 
		
		List<String> names=new ArrayList<>();
		names.add("Əli");
		names.add("Aygün");
		names.add("Azad");
		names.add("Hüseyn");
		names.add("Saleh");
		names.add("Aygün");
		names.add("Adil");
		
		names.add("Ümid");
		names.add("Azad");
		names.add("Həsən");
		names.add("Aygün");
		
		Collections.sort(names);
		System.out.println(names);
		
		
		
		for (int i = -100; i <=10000; i++) {
			System.out.println(i+" - "+(char)i);
		}
	}

}
