package p20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main_21 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Aygun");
		names.add("Azad");
		names.add("Huseyn");
		names.add("Saleh");
		names.add("Aygun");
		names.add("Adil");
		names.add("Saleh");
		names.add("Aygun");
		names.add("Azad");
		names.add("Hesen");
		names.add("Aygun");

		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
	}

}
