package p20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main_23 {

	public static void main(String[] args) {

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Huseyn", "Hüseynov", "088"));
		persons.add(new Person(3, "Ayxan", "Mirzəzadə", "066"));
		persons.add(new Person(2, "Adil", "Eliyev", "077"));

		System.out.println(persons);

		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getId() > o2.getId() ? 1 : -1;
			}

		});
		System.out.println(persons);

		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}

		});
		System.out.println(persons);
		Collections.shuffle(persons);
		System.out.println(persons);
		  
		
	}

}
