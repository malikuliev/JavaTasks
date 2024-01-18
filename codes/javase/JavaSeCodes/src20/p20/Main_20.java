package p20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main_20 {

	public static void main(String[] args) {
	 
		
		// olkede olan her addan nece defe istifade edilib tap
		
		ArrayList<String> names=new ArrayList<>();
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
		
		HashMap<String, Integer> m=new HashMap<>();
		 
		
		for (String name : names) {
			if(m.containsKey(name)) {
				int count=m.get(name);
				count++;
				m.replace(name, count);
			}else {
				m.put(name, 1);
			}
		}
		System.out.println(m);
		
		 
		
		
		
		
		
	}

}
