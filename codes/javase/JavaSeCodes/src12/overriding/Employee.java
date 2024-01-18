package overriding;

public class Employee extends Person {

	public int salary;

	@Override
	public void printInfos() {

		super.printInfos();
		System.out.println("salary : " + salary);
	}
}
